package com.app.book.controller;

import com.app.book.pojo.Book;
import com.app.book.pojo.Cart;
import com.app.book.pojo.CartItem;
import com.app.book.pojo.User;
import com.app.book.service.CartItemService;

import javax.servlet.http.HttpSession;

public class CartController {
    private CartItemService cartItemService;

    public String showCart(HttpSession session){
        User user = (User) session.getAttribute("user");
        if(user != null){
            Cart cart = cartItemService.getCartByUser(user);
            user.setCart(cart);
            session.setAttribute("user", user);
        }
        return "/cart/cart";
    }
    public String addCart(Integer bookId, HttpSession session){
        User user = (User) session.getAttribute("user");
        if (user != null) {
            Cart cart = user.getCart();
            CartItem cartItem = new CartItem(new Book(bookId), 1, user);
            cartItemService.addOrSetCartItem(cartItem, cart);

        }
        return "redirect:cart.do?operate=showCart";
    }

    public String editCartCount(Integer topicId, Integer buyCount){
        cartItemService.setCartItem(new CartItem(topicId, buyCount));


        return "redirect:cart.do?operate=showCart";
    }

}
