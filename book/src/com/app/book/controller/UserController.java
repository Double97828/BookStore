package com.app.book.controller;
import com.app.book.pojo.Cart;
import com.app.book.pojo.CartItem;
import com.app.book.pojo.User;
import com.app.book.service.CartItemService;
import com.app.book.service.UserService;
import javax.servlet.http.HttpSession;



public class UserController {

    private UserService userService ;
    private CartItemService cartItemService;

    public String login(String uname, String pwd, HttpSession session){
        User user = userService.getUser(uname, pwd);
        if (user != null){
            Cart cart = cartItemService.getCartByUser(user);
            user.setCart(cart);
            session.setAttribute("user", user);
            return "redirect:book.do?operate=getBookList";
        }
        return "user/login";
    }

}
