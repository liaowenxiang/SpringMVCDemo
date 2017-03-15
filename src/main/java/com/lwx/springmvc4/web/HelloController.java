package com.lwx.springmvc4.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/3/15.
 */
@Controller
public class HelloController {
    @RequestMapping("/index")
    public String hello(){
        return "index";
    }
}
