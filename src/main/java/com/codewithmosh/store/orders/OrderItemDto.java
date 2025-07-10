package com.codewithmosh.store.orders;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author ileanaoneata on 09.06.2025
 */

@Data
public class OrderItemDto {

    private OderProductDto product;
    private int quantity;
    private BigDecimal totalPrice;
}
