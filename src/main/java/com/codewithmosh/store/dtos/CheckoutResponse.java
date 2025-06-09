package com.codewithmosh.store.dtos;

import lombok.Data;

/**
 * @author ileanaoneata on 06.06.2025
 */

@Data
public class CheckoutResponse {

    private Long orderId;

    public CheckoutResponse(Long orderId) {
        this.orderId = orderId;
    }
}
