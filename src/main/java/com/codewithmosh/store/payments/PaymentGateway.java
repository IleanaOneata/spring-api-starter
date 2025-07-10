package com.codewithmosh.store.payments;

import com.codewithmosh.store.orders.Order;

import java.util.Optional;

/**
 * @author ileanaoneata on 09.06.2025
 */
public interface PaymentGateway {

    CheckoutSession createCheckoutSession(Order order);

    Optional<PaymentResult> parseWebhookRequest(WebhookRequest webhookRequest);
}
