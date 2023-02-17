package com.app.book.pojo;

import java.math.BigDecimal;
import java.util.Map;

public class Cart {
    private Map<Integer, CartItem> cartItemMap ;
    private Double totalPrice;
    private Integer totalCount;

    private Integer totalItem;

    public Cart() {
    }

    public Map<Integer, CartItem> getCartItemMap() {
        return cartItemMap;
    }

    public Double getTotalPrice() {
        totalPrice =0.0;
        BigDecimal result = new BigDecimal("0.0");

        if (cartItemMap != null) {
            for (CartItem cartItem : cartItemMap.values()) {
                BigDecimal price = new BigDecimal(""+cartItem.getBook().getPrice());
                BigDecimal count = new BigDecimal("" + cartItem.getBuyCount());
                result = result.add(price.multiply(count));
            }
        }
        totalPrice = result.doubleValue();
        return totalPrice;
    }

    public Integer getTotalCount() {
        totalCount = 0;
        if (cartItemMap != null){
            return cartItemMap.size();
        }
        return totalCount;

     }

    public void setCartItemMap(Map<Integer, CartItem> cartItemMap) {
        this.cartItemMap = cartItemMap;
    }

    public Integer getTotalItem() {
        totalItem = 0;
        for (Map.Entry<Integer, CartItem> cartItemEntry: cartItemMap.entrySet()){
            totalItem += cartItemEntry.getValue().getBuyCount();
        }
        return totalItem;
    }
}
