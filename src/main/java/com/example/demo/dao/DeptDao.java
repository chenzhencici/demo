package com.example.demo.dao;

import org.apache.ibatis.annotations.Select;

import java.util.Map;

public interface DeptDao {

    @Select("select * from pub_dept")
    Map<String,Object> search();

}
