package com.app.book.service;

import com.app.book.pojo.User;

public interface UserService {
    public User getUser(String login, String pwd);

    public void addUser(User user);
}
