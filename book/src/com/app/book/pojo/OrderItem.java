package com.app.book.pojo;

public class OrderItem {
    private Integer id;
    private Book book;
    private Integer buyCount;
    private OrderBean orderBean;

    public OrderItem() {
    }

    public OrderItem(Book book, Integer buyCount, OrderBean orderBean) {
        this.book = book;
        this.buyCount = buyCount;
        this.orderBean = orderBean;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    public void setOrderBean(OrderBean orderBean) {
        this.orderBean = orderBean;
    }

    public Integer getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public OrderBean getOrderBean() {
        return orderBean;
    }
}
