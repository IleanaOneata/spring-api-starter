package com.codewithmosh.store.services;

import com.codewithmosh.store.entities.Order;

/**
 * @author ileanaoneata on 09.06.2025
 */
public interface PaymentGateway {

    CheckoutSession createCheckoutSession(Order order);
}
