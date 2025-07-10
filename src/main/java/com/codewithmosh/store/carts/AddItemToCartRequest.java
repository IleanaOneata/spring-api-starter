package com.codewithmosh.store.carts;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author ileanaoneata on 12.05.2025
 */

@Data
public class AddItemToCartRequest {

    @NotNull
    private Long productId;
}
