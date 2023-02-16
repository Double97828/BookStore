package com.app.book.service.Impl;

import com.app.book.DAO.CartItemDAO;
import com.app.book.pojo.Book;
import com.app.book.pojo.Cart;
import com.app.book.pojo.CartItem;
import com.app.book.pojo.User;
import com.app.book.service.BookService;
import com.app.book.service.CartItemService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CartItemServiceImpl implements CartItemService {

    private CartItemDAO cartItemDAO;
    private BookService bookService;
    public void addCartItem(CartItem cartItem){
        cartItemDAO.addCartItem(cartItem);
    }

    public void setCartItem(CartItem cartItem){
        cartItemDAO.setCartItem(cartItem);
    }

    @Override
    public void addOrSetCartItem(CartItem cartItem, Cart cart) {
        if (cart != null){
            Map<Integer,CartItem> cartItemMap = cart.getCartItemMap();
            if (cartItemMap == null){
                cartItemMap = new HashMap<Integer, CartItem>();
            }
            if(cartItemMap.containsKey(cartItem.getBook().getId()) == true){
                cartItem = cartItemMap.get(cartItem.getBook().getId());
                cartItem.setBuyCount(cartItem.getBuyCount() + 1);
                setCartItem(cartItem);
            }else{
                cartItemMap.put(cartItem.getBook().getId(), cartItem);
                addCartItem(cartItem);
            }

        }else{
            addCartItem(cartItem);
        }
    }

    @Override
    public Cart getCartByUser(User user) {
        List<CartItem> cartItemList = cartItemDAO.getCartItemList(user);
        Map<Integer, CartItem> cartItemMap = new HashMap<>();
        for (CartItem cartItem: cartItemList){
            Book book = bookService.getBook(cartItem.getBook().getId());
            cartItem.setBook(book);
            cartItemMap.put(cartItem.getBook().getId(), cartItem);
        }
        Cart cart = new Cart();
        cart.setCartItemMap(cartItemMap);
        return cart;
    }


}
