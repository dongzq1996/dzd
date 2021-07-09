package com.ast.dzd.vo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
@Data
public class PayVo {

    private String orderNo;
    private String channelNo;
    private BigDecimal amount;

    public PayVo(String orderNo, String channelNo, BigDecimal amount) {
        this.orderNo = orderNo;
        this.channelNo = channelNo;
        this.amount = amount;
    }
}
