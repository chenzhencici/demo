package com.example.demo;

import com.example.demo.dao.DeptDao;
import com.example.demo.service.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    DeptDao deptDao;

    @Autowired
    DeptService deptService;

    @Test
    public void contextLoads() {
//        ResultData data = deptService.search();
//        System.out.println(data);

    }

}
