package com.wei.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者： Zeng
 * @创建时间： 2018/6/12 8:56
 * @项目名称： myspringboot
 * @功能说明：
 * @最后一次修改说明：
 * @备注：
 */
@EnableAutoConfiguration
@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String hi(){
        return "hello 点点滴滴world!";
    }


}
