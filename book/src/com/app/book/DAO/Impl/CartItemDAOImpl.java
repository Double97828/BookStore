package com.app.book.DAO.Impl;

import com.app.book.DAO.CartItemDAO;
import com.app.book.pojo.CartItem;
import com.app.book.pojo.User;
import com.at.myssm.basedao.BaseDAO;

import java.util.ArrayList;
import java.util.List;

public class CartItemDAOImpl extends BaseDAO<CartItem> implements CartItemDAO {

    @Override
    public void addCartItem(CartItem cartItem) {
        super.executeUpdate("insert into t_cart_item (book, buyCount, userBean) values (?,?,?);", cartItem.getBook().getId(), cartItem.getBuyCount(), cartItem.getUserBean().getId());
    }

    public void setCartItem(CartItem cartItem){
        super.executeUpdate("update t_cart_item set buyCount=? where id=?", cartItem.getBuyCount(),cartItem.getId());

    }

    @Override
    public List<CartItem> getCartItemList(User user) {
        return super.executeQuery("select * from t_cart_item where userBean=?", user.getId());
    }

    @Override
    public void deleteCartItem(CartItem cartItem) {
        super.executeUpdate("delete from t_cart_item where id=?", cartItem.getId());
    }


}
