package com.csvw.oneService.controller;

import com.csvw.oneService.VO.ResultVO;
import com.csvw.oneService.service.DataService;
import com.csvw.oneService.utils.ResultVOUtil;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("/produce")
    public ResultVO<Map<String, String>> produce(@RequestParam("kafkaCluster") String kafkaCluster,
                                                 @RequestParam("sql") String sql) throws SQLException, JSONException, ClassNotFoundException {

        Map<String, Object> returnedData = dataService.produceMessage(kafkaCluster, sql);

        return ResultVOUtil.success(returnedData);
    }

}
