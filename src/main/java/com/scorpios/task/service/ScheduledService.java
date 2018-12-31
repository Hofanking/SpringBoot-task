package com.scorpios.task.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Think
 * @Title: ScheduledService
 * @ProjectName springboot-task
 * @Description: TODO
 * @date 2018/12/1522:19
 */

@Service
public class ScheduledService {

    @Scheduled(cron = "0 * * * * MON-SAT")
    public void hello() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        System.out.println(simpleDateFormat.format(new Date()) + "    hello……");

    }

}
