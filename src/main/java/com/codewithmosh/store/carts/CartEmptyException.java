package com.codewithmosh.store.carts;

/**
 * @author ileanaoneata on 09.06.2025
 */
public class CartEmptyException extends RuntimeException {

    public CartEmptyException() {
        super("Cart is empty");
    }
}
