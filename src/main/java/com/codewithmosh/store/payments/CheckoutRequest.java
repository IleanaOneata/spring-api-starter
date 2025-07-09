package com.codewithmosh.store.payments;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.UUID;

/**
 * @author ileanaoneata on 06.06.2025
 */

@Data
public class CheckoutRequest {

    @NotNull(message = "Cart ID is required")
    private UUID cartId;
}
