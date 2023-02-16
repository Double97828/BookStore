package com.app.book.DAO.Impl;

import com.app.book.DAO.OrderDAO;
import com.app.book.pojo.OrderBean;
import com.at.myssm.basedao.BaseDAO;

public class OrderDAOImpl extends BaseDAO<OrderBean> implements OrderDAO {
    @Override
    public void addOrderBean(OrderBean orderBean) {
        Integer id = super.executeUpdate("insert into t_order (orderNo,orderDate,orderUser, orderMoney, orderStatus)values(?,?,?,?,?);", orderBean.getOrderNo(),orderBean.getOrderDate(),orderBean.getOrderUser().getId(),orderBean.getOrderMoney(),orderBean.getOrderStatus());
        orderBean.setId(id);
    }
}
