package com.codewithmosh.store.products;



import lombok.*;

import java.math.BigDecimal;

/**
 * @author ileanaoneata on 08.05.2025
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDto {

    private Long id;
    private String name;
    private BigDecimal price;
    private String description;
    private Byte categoryId;
}
