package com.ast.dzd.service.impl;

import com.ast.dzd.service.TestService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {


    @Override
    public Map<String, Object> get(String channelNo) {
        Map<String,Object> map = new HashMap<>();
        map.put("code","0000");
        map.put("msg","test1 channelNo no.1");
        return map;
    }
}
