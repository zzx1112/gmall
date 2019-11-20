package com.zzx.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.print.DocFlavor;

/**
 * @Author zzx
 * @Date 2019/11/20 19:24
 **/
@Controller
public class PageController {

    @RequestMapping("toindex")
    public String toIndex(){
        return "index";
    }
}
