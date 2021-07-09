package com.ast.dzd.service;

import javax.naming.spi.InitialContextFactory;
import java.util.Map;

public interface PayService extends InitialContextFactory{

    public String getOrderNo();

    public String getOrderPayTime();

    public Map<String,Object> pay();
}
