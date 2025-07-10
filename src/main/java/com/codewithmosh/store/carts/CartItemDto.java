package com.codewithmosh.store.carts;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author ileanaoneata on 12.05.2025
 */

@Data
public class CartItemDto {

    private CartProductDto product;
    private int quantity;
    private BigDecimal totalPrice;
}
