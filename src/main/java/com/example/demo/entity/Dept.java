package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pub_dept")
public class Dept {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column
    private String deptName;
    @Column
    private String address;
    @Column
    private Integer status;
    @Column
    private Date createDate;

    public Dept() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                ", createDate=" + createDate +
                '}';
    }
}
