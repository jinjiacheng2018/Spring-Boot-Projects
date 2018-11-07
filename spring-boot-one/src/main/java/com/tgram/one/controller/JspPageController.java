package com.tgram.one.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *<p> Description: 整合JSP页面跳转控制层 </p>
 *<p> Copyright: Copyright(c) 2018/11/1 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2018/11/1 23:42
 */
@Controller
@RequestMapping("jsp")
public class JspPageController {

    @RequestMapping(value = "/index")
    public String indexJsp(Model model){
        // 添加属性
        model.addAttribute("msg","Hello,SpringBoot include JSP !!!");

        return "success";
    }
}
