package com.example.demo.service;

import com.example.demo.entity.DeptQuery;
import com.example.demo.entity.ResultData;

public interface DeptService {

    String SERVICE_NAME = "deptService";

    ResultData search(DeptQuery query);

}
