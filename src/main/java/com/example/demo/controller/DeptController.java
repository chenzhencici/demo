package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept")
@Api
public class DeptController {

    @RequestMapping("/")
    @ApiOperation(value = "跳转至部门页面",notes = "")
    public String home(){
        return "/home";
    }
}
