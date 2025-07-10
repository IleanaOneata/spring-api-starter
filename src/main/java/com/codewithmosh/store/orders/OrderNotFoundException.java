package com.codewithmosh.store.orders;

/**
 * @author ileanaoneata on 09.06.2025
 */
public class OrderNotFoundException extends RuntimeException {

    public OrderNotFoundException() {
        super("Order not found");
    }
}
