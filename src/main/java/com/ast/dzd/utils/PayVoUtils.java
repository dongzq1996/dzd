package com.ast.dzd.utils;

import com.ast.dzd.vo.PayVo;

public class PayVoUtils {
    private static ThreadLocal<PayVo> threadLocal=new ThreadLocal<>();
    public static void set(PayVo vo) {
        threadLocal.set(vo);
    }
    public static PayVo get() {
        return threadLocal.get();
    }
}
