package com.ast.dzd.service.impl;

import com.ast.dzd.service.PayService;
import com.ast.dzd.utils.PayVoUtils;

import javax.naming.Context;
import javax.naming.NamingException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public  abstract class OnlinePayServiceDefult implements PayService {
    private static ThreadLocal controllerContext = new ThreadLocal();


    @Override
    public String getOrderPayTime() {
        System.out.println("202107091"+ PayVoUtils.get().getChannelNo());
        return "20210709"+ PayVoUtils.get().getChannelNo();
    }

    public Map<String,Object> pay(){
        Map<String,Object> map = new HashMap<>();
        map.put("code","1001");
        map.put("msg","支付失败，未找到对应渠道");
        return map;
    }

    @Override
    public Context getInitialContext(Hashtable<?, ?> environment) throws NamingException {
        return null;
    }

}
