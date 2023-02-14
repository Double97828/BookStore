package com.app.book.DAO;

import com.app.book.pojo.User;

public interface UserDAO {
    public User getUser(String login, String pwd);
}
