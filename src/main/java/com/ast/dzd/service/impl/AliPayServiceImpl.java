package com.ast.dzd.service.impl;

import org.springframework.stereotype.Service;

import javax.naming.Context;
import javax.naming.NamingException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

@Service("ali")
public class AliPayServiceImpl extends OnlinePayServiceDefult{
    @Override
    public String getOrderNo() {
        return "ali-000002";
    }

    @Override
    public String getOrderPayTime() {
        return "30303030303003";
    }

    @Override
    public Map<String, Object> pay() {
        Map<String,Object> map = new HashMap<>();
        map.put("code","0000");
        map.put("msg","ali支付成功");
        return map;
    }

}
