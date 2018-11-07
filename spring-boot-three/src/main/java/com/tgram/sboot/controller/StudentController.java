package com.tgram.sboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *<p> Description: 描述信息 </p>
 *<p> Copyright: Copyright(c) 2018/11/7 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2018/11/7 18:20
 */
@RestController
public class StudentController {

    @RequestMapping("/index")
    public String index(){
        return "Hello,SpringBoot";
    }
}
