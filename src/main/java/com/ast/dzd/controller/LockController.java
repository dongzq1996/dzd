package com.ast.dzd.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 测试lock
 */
@Slf4j
@RestController
@RequestMapping(value = "/lock")
public class LockController {

    //锁Lock分为 公平锁 和 非公平锁，
    //公平锁表示线程获取锁的的顺序是按照线程加锁的顺序来分配的
    //非公平锁随机获得
    //Lock lock = new ReentrantLock(true/false) 公平/非公平
    //默认情况下，ReentrantLock类使用的是非公平锁
    private final Lock lock = new ReentrantLock();


    @RequestMapping(value = "/get")
    public Map<String,Object> get(String channelNo) throws InterruptedException {
        Map<String,Object> map = new HashMap<>();
        if (lock.tryLock()){
            try {
                // 测试锁成功
                log.info("获取锁成功");
                map.put("code","0000");
                map.put("msg","成功");
            }catch (Exception e){
                e.printStackTrace();
                log.info("业务异常");
            }finally {
                log.info("释放锁");
                lock.unlock();
            }
        }else{
            map.put("code","9999");
            map.put("msg","当前业务正在处理中");
        }
        return map;
    }


}
