package com.ast.dzd.controller;

import com.ast.dzd.service.TestService;
import com.ast.dzd.service.impl.OnlinePayServiceDefult;
import com.ast.dzd.utils.PayVoUtils;
import com.ast.dzd.vo.PayVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Map;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    protected Map<String, OnlinePayServiceDefult> channels;
    @Autowired
    private TestService testService;


    @RequestMapping(value = "/get")
    public Map<String,Object> get(String channelNo){
        return channels.get(channelNo).pay();
    }


    @RequestMapping(value = "/getOrderPayTime")
    public String getOrderPayTime(String channelNo){
        PayVoUtils.set(new PayVo("123",channelNo,new BigDecimal(1)));
        return channels.get(channelNo).getOrderPayTime();
    }
}
