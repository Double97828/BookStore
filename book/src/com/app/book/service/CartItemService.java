package com.app.book.service;

import com.app.book.pojo.Cart;
import com.app.book.pojo.CartItem;
import com.app.book.pojo.User;

public interface CartItemService {
    public void addCartItem(CartItem cartItem);

    public void setCartItem(CartItem cartItem);

    public void  addOrSetCartItem(CartItem cartItem, Cart cart);

    public Cart getCartByUser(User user);


}
