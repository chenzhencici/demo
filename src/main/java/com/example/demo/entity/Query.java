package com.example.demo.entity;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

public class Query implements Serializable {

    private static final long serialVersionUID = -169541580507323538L;

    private String pageJson;

    private PageBean page = new PageBean();

    private String keyword;

    private String orderSql;

    public Query() {
    }

    public String getPageJson() {
        return pageJson;
    }

    public void setPageJson(String pageJson) {
        this.pageJson = pageJson;
        blendPage(pageJson);
    }

    private void blendPage(String pageJson){
        this.page = JSON.parseObject(pageJson,PageBean.class);
    }

    public PageBean getPage() {
        return page;
    }

    public void setPage(PageBean page) {
        this.page = page;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getOrderSql() {
        return orderSql;
    }

    public void setOrderSql(String orderSql) {
        this.orderSql = orderSql;
    }

    @Override
    public String toString() {
        return "Query{" +
                "pageJson='" + pageJson + '\'' +
                ", page=" + page +
                ", keyword='" + keyword + '\'' +
                ", orderSql='" + orderSql + '\'' +
                '}';
    }
}
