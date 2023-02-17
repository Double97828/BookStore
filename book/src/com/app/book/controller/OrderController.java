package com.app.book.controller;

import com.app.book.pojo.OrderBean;
import com.app.book.pojo.User;
import com.app.book.service.OrderService;

import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class OrderController {
    private OrderService orderService;

    public String showOrder(HttpSession session){
        User user = (User) session.getAttribute("user");
        if(user != null){
            List<OrderBean> orderBeanList = orderService.getOrderList(user);
            user.setOrderBeanList(orderBeanList);
            session.setAttribute("user", user);
        }


        return "order/order";
    }

    public String checkOut(HttpSession session){
        User user = (User) session.getAttribute("user");
        if (user != null){
            Date date = new Date();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String nowStr= dateFormat.format(date);
            String timeStamp = nowStr.substring(0,4) + nowStr.substring(5,7) + nowStr.substring(8,10)
                    + nowStr.substring(11,13) + nowStr.substring(14,16) + nowStr.substring(17,19);
            String orderNo = UUID.randomUUID().toString() + "_" + timeStamp;

            OrderBean orderBean = new OrderBean(orderNo, date, user, user.getCart().getTotalPrice(), 0);

            orderService.addOrder(orderBean);
            session.setAttribute("order", orderBean);
        }


        return "cart/checkout";
    }
}
