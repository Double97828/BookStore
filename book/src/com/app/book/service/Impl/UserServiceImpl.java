package com.app.book.service.Impl;

import com.app.book.DAO.UserDAO;
import com.app.book.pojo.User;
import com.app.book.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDAO userDAO = null;

    @Override
    public User getUser(String login, String pwd) {
        return userDAO.getUser(login,pwd);
    }

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }
}
