package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

public class ResultMsg implements Serializable {

    private static final long serialVersionUID = 257596194004573663L;

    private Integer draw;

    private Integer recordsTotal;

    private Integer recordsFiltered;

    private List<Object> data;


}
