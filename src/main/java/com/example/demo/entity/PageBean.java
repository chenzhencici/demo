package com.example.demo.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PageBean implements Serializable {

    private static final long serialVersionUID = -4936303688803585998L;

    private Integer draw;

    private Integer start;

    private Integer length;

    private Search search;

    private List<Order> order = new ArrayList<>();

    private List<Column> columns = new ArrayList<>();

    public PageBean() {
    }

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "draw=" + draw +
                ", start=" + start +
                ", length=" + length +
                ", search=" + search +
                ", order=" + order +
                ", columns=" + columns +
                '}';
    }

    public static class Search implements Serializable {

        private static final long serialVersionUID = -3667715755971991789L;

        private String value;

        private Boolean regex;

        public Search() {
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Boolean getRegex() {
            return regex;
        }

        public void setRegex(Boolean regex) {
            this.regex = regex;
        }

        @Override
        public String toString() {
            return "Search{" +
                    "value='" + value + '\'' +
                    ", regex=" + regex +
                    '}';
        }
    }

    public static class Order implements Serializable{

        private static final long serialVersionUID = -3289838596390246081L;

        private Integer column;

        private String dir;

        public Order() {
        }

        public Integer getColumn() {
            return column;
        }

        public void setColumn(Integer column) {
            this.column = column;
        }

        public String getDir() {
            return dir;
        }

        public void setDir(String dir) {
            this.dir = dir;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "column=" + column +
                    ", dir='" + dir + '\'' +
                    '}';
        }
    }

    public static class Column implements Serializable{

        private static final long serialVersionUID = 1081761504197569437L;

        private String data;

        private String name;

        private Boolean searchable;

        private Boolean orderable;

        private Search search;

        public Column() {
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Boolean getSearchable() {
            return searchable;
        }

        public void setSearchable(Boolean searchable) {
            this.searchable = searchable;
        }

        public Boolean getOrderable() {
            return orderable;
        }

        public void setOrderable(Boolean orderable) {
            this.orderable = orderable;
        }

        public Search getSearch() {
            return search;
        }

        public void setSearch(Search search) {
            this.search = search;
        }

        @Override
        public String toString() {
            return "Column{" +
                    "data='" + data + '\'' +
                    ", name='" + name + '\'' +
                    ", searchable=" + searchable +
                    ", orderable=" + orderable +
                    ", search=" + search +
                    '}';
        }
    }

}
