package com.app.book.DAO;

import com.app.book.pojo.CartItem;
import com.app.book.pojo.User;

import java.util.List;

public interface CartItemDAO {
    public void addCartItem(CartItem cartItem);

    public void setCartItem(CartItem cartItem);

    public List<CartItem> getCartItemList(User user);

    public void deleteCartItem(CartItem cartItem);
}
