package com.app.book.service.Impl;

import com.app.book.DAO.OrderDAO;
import com.app.book.DAO.OrderItemDAO;
import com.app.book.pojo.*;
import com.app.book.service.CartItemService;
import com.app.book.service.OrderService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderServiceImpl implements OrderService {

    private OrderDAO orderDAO;
    private OrderItemDAO orderItemDAO;
    private CartItemService cartItemService;
    @Override
    public void addOrder(OrderBean orderBean) {
        orderDAO.addOrderBean(orderBean);
        User user =  orderBean.getOrderUser();
        Cart cart = user.getCart();
        Map<Integer, CartItem> cartItemMap = cart.getCartItemMap();
        List<OrderItem> orderItemList = new ArrayList<>();


        for (CartItem cartItem:cartItemMap.values()){
            OrderItem orderItem = new OrderItem(cartItem.getBook(), cartItem.getBuyCount(), orderBean);
            orderItemDAO.addOrderItem(orderItem);
            orderItemList.add(orderItem);
        }
        orderBean.setOrderList(orderItemList);
        cartItemService.cleanCart(user);
    }
}
