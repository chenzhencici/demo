package com.example.demo.service.Impl;

import com.example.demo.dao.DeptDao;
import com.example.demo.entity.DeptQuery;
import com.example.demo.entity.ResultData;
import com.example.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service(DeptService.SERVICE_NAME)
@Transactional
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptDao deptDao;

    @Override
    @Transactional
    public ResultData search(DeptQuery query) {
        ResultData result = new ResultData();
        //查询记录数
        int total = deptDao.searchCount(query);
        //查询分页记录
        List<Map<String, Object>> searchInfo = deptDao.search(query);

        result.setData(searchInfo);
        result.setRecordsTotal(total);

        return result;
    }
}
