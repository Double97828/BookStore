package com.app.book.service;
import com.app.book.pojo.OrderBean;
import com.app.book.pojo.User;

import java.util.List;

public interface OrderService {
    public void addOrder(OrderBean orderBean);

    public List<OrderBean> getOrderList(User user);


}
