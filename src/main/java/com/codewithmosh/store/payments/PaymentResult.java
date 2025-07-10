package com.codewithmosh.store.payments;

import com.codewithmosh.store.orders.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author ileanaoneata on 08.07.2025
 */

@AllArgsConstructor
@Getter
public class PaymentResult {

    private Long orderId;
    private PaymentStatus paymentStatus;
}
