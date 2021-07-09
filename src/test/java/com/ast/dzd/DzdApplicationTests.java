package com.ast.dzd;

import com.ast.dzd.service.impl.OnlinePayServiceDefult;
import com.ast.dzd.utils.PayVoUtils;
import com.ast.dzd.vo.PayVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Map;

@SpringBootTest
class DzdApplicationTests {

    @Autowired
    protected Map<String, OnlinePayServiceDefult> channels;

    @Test
    void contextLoads() {
        for (int i = 0; i <100 ; i++) {
            tt tt= new tt(i+"");
            tt.run();
        }

    }


    private class tt implements Runnable {
        private String i;

        public tt(String i){
            this.i=i;
        }

        @Override
        public void run() {
            PayVoUtils.set(new PayVo(i+"","wx",new BigDecimal(1)));
            channels.get("wx").getOrderPayTime();
        }
    }
}
