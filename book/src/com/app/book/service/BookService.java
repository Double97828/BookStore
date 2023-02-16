package com.app.book.service;

import com.app.book.pojo.Book;

import java.util.List;

public interface BookService {
    public List<Book> getBookList();

    public Book getBook(Integer bookId);
}
