package com.scorpios.task.controller;

import com.scorpios.task.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Think
 * @Title: AsyncController
 * @ProjectName springboot-task
 * @Description: TODO
 * @date 2018/12/1522:07
 */

@RestController
public class AsyncController {

    @Autowired
    AsyncService asyncService;

    @GetMapping("/hello")
    public String hello() {
        asyncService.hello();
        return "success";
    }

}
