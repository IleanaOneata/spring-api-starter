package com.codewithmosh.store.carts;

/**
 * @author ileanaoneata on 14.05.2025
 */
public class CartNotFoundException extends RuntimeException {

    public CartNotFoundException() {
        super("Cart not found");
    }
}
