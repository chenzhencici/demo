package com.example.demo.dao;

import com.example.demo.entity.DeptQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DeptDao {

    List<Map<String,Object>> search(DeptQuery query);

    int searchCount(DeptQuery query);

}
