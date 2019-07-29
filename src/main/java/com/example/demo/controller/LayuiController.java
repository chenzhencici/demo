package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/layui")
public class LayuiController {

    @RequestMapping("/")
    public String home(HttpServletRequest request){
        return "/layuiHome";
    }
}
