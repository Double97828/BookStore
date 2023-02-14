package com.app.book.pojo;

public class Book {
    private Integer id;
    private String bookImg;
    private String bookName;
    private Integer price;

    private User author;

    private Integer saleCount;

    private Integer bookCount;

    private Integer bookStatus;

    public Book() {
    }

    public Book(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public void setBookCount(Integer bookCount) {
        this.bookCount = bookCount;
    }

    public void setBookStatus(Integer bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String getBookImg() {
        return bookImg;
    }

    public String getBookName() {
        return bookName;
    }

    public Integer getPrice() {
        return price;
    }

    public User getAuthor() {
        return author;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public Integer getBookCount() {
        return bookCount;
    }

    public Integer getBookStatus() {
        return bookStatus;
    }
}
