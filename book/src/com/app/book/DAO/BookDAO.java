package com.app.book.DAO;

import com.app.book.pojo.Book;

import java.util.List;

public interface BookDAO {
    public List<Book> getBookList();

    public Book getBookById(Integer bookId);
}
