package com.csvw.oneService.service;

import org.json.JSONException;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Map;


public interface DataService {

    Map<String, Object> produceMessage(String kafkaCluster, String sql) throws SQLException, JSONException, ClassNotFoundException;
}
