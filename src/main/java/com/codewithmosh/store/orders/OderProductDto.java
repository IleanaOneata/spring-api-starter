package com.codewithmosh.store.orders;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author ileanaoneata on 09.06.2025
 */

@Data
public class OderProductDto {

    private Long id;
    private String name;
    private BigDecimal price;
}
