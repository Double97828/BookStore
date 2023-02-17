package com.app.book.pojo;

import java.math.BigDecimal;

public class CartItem {
    private Integer id;
    private  Book book;
    private  Integer buyCount;
    private User userBean;

    private Double itemTotal;

    public CartItem() {
    }

    public CartItem(Integer id, Integer buyCount) {
        this.id = id;
        this.buyCount = buyCount;
    }

    public CartItem(Book book, Integer buyCount, User userBean) {
        this.book = book;
        this.buyCount = buyCount;
        this.userBean = userBean;
    }

    public CartItem(Integer id) {
        this.id = id;
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

    public void setUserBean(User userBean) {
        this.userBean = userBean;
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

    public User getUserBean() {
        return userBean;
    }

    public Double getItemTotal() {
        BigDecimal itemPrice = new BigDecimal("" + getBook().getPrice());
        BigDecimal itemCount = new BigDecimal("" + getBuyCount());
        BigDecimal result = itemPrice.multiply(itemCount);
        itemTotal = result.doubleValue();
        return itemTotal;
    }

}
