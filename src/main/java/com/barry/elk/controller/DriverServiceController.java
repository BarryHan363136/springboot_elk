package com.barry.elk.controller;

import com.alibaba.fastjson.JSON;
import com.barry.elk.vo.business.CustomInfo;
import com.barry.elk.vo.business.ResponseMessage;
import com.barry.elk.vo.business.VehicleInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/driverService")
public class DriverServiceController {

    private static final Logger logger = LoggerFactory.getLogger(DriverServiceController.class);

    @RequestMapping(value="/receiveCustomInfo", method = RequestMethod.POST)
    public ResponseMessage receiveCustomInfo(@RequestBody CustomInfo customInfo) {
        logger.warn("springboot elk-logstash测试信息:receiveCustomInfo");
        logger.info("receiveCustomInfo接收到的参数为:"+ JSON.toJSONString(customInfo));
        return new ResponseMessage("1", "接收成功!");
    }

    @RequestMapping(value="/receiveVehicleInfo", method = RequestMethod.POST)
    public ResponseMessage receiveVehicleInfo(@RequestBody VehicleInfo vehicleInfo) {
        logger.warn("springboot elk-logstash测试信息:receiveVehicleInfo");
        logger.info("receiveVehicleInfo接收到的参数为:"+ JSON.toJSONString(vehicleInfo));
        return new ResponseMessage("1", "接收成功!");
    }

}
