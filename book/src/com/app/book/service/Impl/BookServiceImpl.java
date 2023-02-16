package com.app.book.service.Impl;

import com.app.book.DAO.BookDAO;
import com.app.book.pojo.Book;
import com.app.book.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookDAO bookDAO;
    @Override
    public List<Book> getBookList() {
        return bookDAO.getBookList();
    }

    @Override
    public Book getBook(Integer bookId) {
        return bookDAO.getBookById( bookId);
    }
}
