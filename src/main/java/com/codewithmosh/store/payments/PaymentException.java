package com.codewithmosh.store.payments;

import lombok.NoArgsConstructor;

/**
 * @author ileanaoneata on 09.06.2025
 */

@NoArgsConstructor
public class PaymentException extends RuntimeException {
    public PaymentException(String message) {
        super(message);
    }
}
