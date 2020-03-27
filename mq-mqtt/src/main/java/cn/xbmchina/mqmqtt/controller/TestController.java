package cn.xbmchina.mqmqtt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private MqttGateway mqttGateway;

    @RequestMapping("/sendMqtt.do")
    public String sendMqtt(@RequestParam("sendData") String  sendData, @RequestParam("topic") String topic){
        mqttGateway.sendToMqtt(sendData,topic);
        return "OK";
    }
}