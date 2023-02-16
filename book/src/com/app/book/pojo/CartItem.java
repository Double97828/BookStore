package com.app.book.pojo;

public class CartItem {
    private Integer id;
    private  Book book;
    private  Integer buyCount;
    private User userBean;

    public CartItem() {
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
}
