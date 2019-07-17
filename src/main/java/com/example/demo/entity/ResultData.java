package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

public class ResultData implements Serializable {

    private static final long serialVersionUID = 257596194004573663L;

    private Integer draw;

    private Integer recordsTotal;

    private Integer recordsFiltered;

    private List data;

    private Integer code;

    private String msg;

    public ResultData() {
    }

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public Integer getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(Integer recordsTotal) {
        this.recordsTotal = recordsTotal;
        this.setRecordsFiltered(recordsTotal);
    }

    public Integer getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(Integer recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResultMsg{" +
                "draw=" + draw +
                ", recordsTotal=" + recordsTotal +
                ", recordsFiltered=" + recordsFiltered +
                ", data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
