package com.tgram.one.controller;

import com.alibaba.fastjson.JSONObject;
import com.tgram.one.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *<p> Description: 描述信息 </p>
 *<p> Copyright: Copyright(c) 2018/10/31 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2018/10/31 22:47
 */
@RestController
public class SudentController {

    @RequestMapping(value = "/index")
    public String index(){
        return "Hello,SpringBoot";
    }

    @RequestMapping(value = "/student")
    public String student(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("student",new Student(1,"Tom",20));
        return jsonObject.toJSONString();
    }
}
