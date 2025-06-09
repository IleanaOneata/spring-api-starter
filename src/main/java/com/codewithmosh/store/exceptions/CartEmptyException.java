package com.codewithmosh.store.exceptions;

/**
 * @author ileanaoneata on 09.06.2025
 */
public class CartEmptyException extends RuntimeException {

    public CartEmptyException() {
        super("Cart is empty");
    }
}
