package com.csvw.oneService.service.serviceImpl;

import com.csvw.oneService.service.DataService;
import mailgun.kafkapixy.KafkaPixyClient;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class DataServiceImpl implements DataService {

    KafkaPixyClient client = new KafkaPixyClient("10.122.70.102:19091");

    @Override
    public Map<String, Object> produceMessage(String kafkaCluster, String sql) throws SQLException, JSONException, ClassNotFoundException {

        String topicName = getTopicName();

        Connection conn = getConn();
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();

        int recordCount = 0;
        while (resultSet.next()) {
            recordCount++;
            JSONObject jsonObj = new JSONObject();
            for (int col = 1; col <= columnCount; col++) {
                String columnName = metaData.getColumnLabel(col);
                String value = resultSet.getString(columnName);
                jsonObj.put(columnName, value);
            }
            client.produceMsg(kafkaCluster, "kafka-pixy", jsonObj.toString(), true);
        }

        resultSet.close();
        statement.close();
        conn.close();

        Map<String, Object> meta = new HashMap<>();
        meta.put("topic", topicName);
        meta.put("recordCount", recordCount);

        return meta;
    }

    private static Connection getConn() throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.hive.jdbc.HiveDriver");
        Connection connection = DriverManager.getConnection("jdbc:impala://10.122.44.113:21050/tmp;AuthMech=3;UID=scb;PWD=scb");

        return connection;
    }


    private static String getTopicName() {
        String tableName = "topic-";
        String uuid = UUID.randomUUID().toString().toUpperCase().replaceAll(" ", "-");
        String topic = tableName.concat(uuid);
        return topic;
    }


}
