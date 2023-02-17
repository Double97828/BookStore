package com.app.book.DAO.Impl;

import com.app.book.DAO.OrderDAO;
import com.app.book.pojo.OrderBean;
import com.app.book.pojo.User;
import com.at.myssm.basedao.BaseDAO;

import java.math.BigDecimal;
import java.util.List;

public class OrderDAOImpl extends BaseDAO<OrderBean> implements OrderDAO {
    @Override
    public void addOrderBean(OrderBean orderBean) {
        Integer id = super.executeUpdate("insert into t_order (orderNo,orderDate,orderUser, orderMoney, orderStatus)values(?,?,?,?,?);", orderBean.getOrderNo(),orderBean.getOrderDate(),orderBean.getOrderUser().getId(),orderBean.getOrderMoney(),orderBean.getOrderStatus());
        orderBean.setId(id);
    }

    @Override
    public List<OrderBean> getOrderList(User user) {
        return super.executeQuery("select * from t_order where orderUser=?;", user.getId());
    }

    @Override
    public Integer getTotalCount(OrderBean orderBean) {
        return ((BigDecimal)super.executeComplexQuery("select ifnull(sum(buyCount),0) from t_order_item where orderBean=?", orderBean.getId())[0]).intValue();
    }
}
