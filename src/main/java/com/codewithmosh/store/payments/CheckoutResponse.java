package com.codewithmosh.store.payments;

import lombok.Data;

/**
 * @author ileanaoneata on 06.06.2025
 */

@Data
public class CheckoutResponse {

    private Long orderId;
    private String checkoutUrl;

    public CheckoutResponse(Long orderId, String checkoutUrl) {
        this.orderId = orderId;
        this.checkoutUrl = checkoutUrl;
    }
}
