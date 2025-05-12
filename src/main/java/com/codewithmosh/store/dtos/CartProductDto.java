package com.codewithmosh.store.dtos;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author ileanaoneata on 12.05.2025
 */

@Data
public class CartProductDto {

    private Long id;
    private String name;
    private BigDecimal price;
}
