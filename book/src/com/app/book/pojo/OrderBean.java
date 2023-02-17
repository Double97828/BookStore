package com.app.book.pojo;

import java.util.Date;
import java.util.List;

public class OrderBean {
    private Integer id;
    private String orderNo;

    private Date orderDate;
    private User orderUser;

    private Double orderMoney;

    private Integer orderStatus;

    private Integer totalCount;

    private List<OrderItem> orderList;

    public OrderBean() {
    }

    public OrderBean(String orderNo, Date orderDate, User orderUser, Double orderMoney, Integer orderStatus) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderUser = orderUser;
        this.orderMoney = orderMoney;
        this.orderStatus = orderStatus;
    }

    public OrderBean(Integer id) {
        this.id = id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setOrderUser(User orderUser) {
        this.orderUser = orderUser;
    }

    public void setOrderMoney(Double orderMoney) {
        this.orderMoney = orderMoney;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setOrderList(List<OrderItem> orderList) {
        this.orderList = orderList;
    }

    public Integer getId() {
        return id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public User getOrderUser() {
        return orderUser;
    }

    public Double getOrderMoney() {
        return orderMoney;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public List<OrderItem> getOrderList() {
        return orderList;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
