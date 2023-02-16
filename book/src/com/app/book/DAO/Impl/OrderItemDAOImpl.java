package com.app.book.DAO.Impl;

import com.app.book.DAO.OrderItemDAO;
import com.app.book.pojo.OrderItem;
import com.at.myssm.basedao.BaseDAO;

public class OrderItemDAOImpl extends BaseDAO<OrderItem> implements OrderItemDAO {
    @Override
    public void addOrderItem(OrderItem orderItem) {
        super.executeUpdate("insert into t_order_item (book, buyCount, orderBean) values(?,?,?)", orderItem.getBook().getId(),orderItem.getBuyCount(),orderItem.getOrderBean().getId());
    }
}

