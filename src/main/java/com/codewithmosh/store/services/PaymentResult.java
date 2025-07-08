package com.codewithmosh.store.services;

import com.codewithmosh.store.entities.PaymentStatus;
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
