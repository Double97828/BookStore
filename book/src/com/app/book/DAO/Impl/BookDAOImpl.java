package com.app.book.DAO.Impl;

import com.app.book.DAO.BookDAO;
import com.app.book.pojo.Book;
import com.at.myssm.basedao.BaseDAO;

import java.util.List;

public class BookDAOImpl extends BaseDAO<Book> implements BookDAO {
    @Override
    public List<Book> getBookList() {
        return super.executeQuery("select * from t_book where bookStatus=0");
    }

    @Override
    public Book getBookById(Integer bookId) {
        return super.load("select * from t_book where id=?", bookId);
    }
}
