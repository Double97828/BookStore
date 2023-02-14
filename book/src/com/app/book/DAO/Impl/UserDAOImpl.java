package com.app.book.DAO.Impl;
import com.app.book.DAO.UserDAO;
import com.app.book.pojo.User;
import com.at.myssm.basedao.BaseDAO;

public class UserDAOImpl extends BaseDAO<User> implements UserDAO{


    @Override
    public User getUser(String login, String pwd) {
        return super.load("select * from t_user where uname=? and pwd=?", login, pwd);
    }
}
