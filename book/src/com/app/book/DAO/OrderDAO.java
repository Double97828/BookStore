package com.app.book.DAO;

import com.app.book.pojo.OrderBean;
import com.app.book.pojo.User;

import java.util.List;

public interface OrderDAO {
    public void addOrderBean(OrderBean orderBean);

    public List<OrderBean> getOrderList(User user);

    public Integer getTotalCount(OrderBean orderBean);
}
