package com.ast.dzd.service.impl;

import org.springframework.stereotype.Service;

import javax.naming.Context;
import javax.naming.NamingException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

@Service("wx")
public class WxPayServiceImpl extends OnlinePayServiceDefult{
    @Override
    public String getOrderNo() {
        return "wx000001";
    }

    @Override
    public Map<String, Object> pay() {
        Map<String,Object> map = new HashMap<>();
        map.put("code","0000");
        map.put("msg","微信支付成功");
        return map;
    }

}
