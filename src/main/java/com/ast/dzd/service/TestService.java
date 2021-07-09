package com.ast.dzd.service;

import org.springframework.stereotype.Service;

import java.util.Map;


public interface TestService {

    Map<String, Object> get(String channelNo);
}
