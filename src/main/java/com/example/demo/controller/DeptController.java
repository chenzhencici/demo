package com.example.demo.controller;

import com.example.demo.entity.ResultData;
import com.example.demo.service.DeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept")
@Api
public class DeptController {

    @Autowired
    DeptService deptService;

    @RequestMapping("/")
    @ApiOperation(value = "跳转至部门页面",notes = "")
    public String home(Model model){
        return "/home";
    }


    @RequestMapping("/search")
    public ResultData search(){
        ResultData result = new ResultData();
        return result;
    }
}
