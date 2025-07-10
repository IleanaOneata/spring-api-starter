package com.codewithmosh.store.carts;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author ileanaoneata on 12.05.2025
 */

@Data
public class UpdateCartItemRequest {

    @NotNull(message = "Quantity must be provided")
    @Min(value = 1, message = "Quantity must be grater than zero.")
    @Max(value = 100, message = "Quantity must be less than or equal to 100.")
    private Integer quantity;
}
