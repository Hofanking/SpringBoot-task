package com.scorpios.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author Think
 * @Title: AsyncService
 * @ProjectName springboot-task
 * @Description: TODO
 * @date 2018/12/1522:05
 */
@Service
public class AsyncService {


    @Async //该方法是异步的
    public void hello() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("业务正在处理中……");

    }

}
