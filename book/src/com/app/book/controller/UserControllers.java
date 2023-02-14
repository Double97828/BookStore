package com.app.book.controller;
import com.app.book.pojo.User;
import com.app.book.service.UserService;
import javax.servlet.http.HttpSession;



public class UserControllers {

    private UserService userService = null;

    public String login(String uname, String pwd, HttpSession session){
        User user = userService.getUser(uname, pwd);
        if (user != null){
            return "index";
        }
        return "user/login";
    }

}
