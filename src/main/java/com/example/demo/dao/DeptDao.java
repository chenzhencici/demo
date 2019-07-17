package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface DeptDao {

    @Select("select ID,ADDRESS,DEPT_NAME DEPTNAME,CREATE_DATE CREATEDATE,STATUS from pub_dept")
    List<Map<String,Object>> search();

    @Select("select count(1) from pub_dept")
    int searchCount();

}
