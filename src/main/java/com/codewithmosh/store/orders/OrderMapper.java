package com.codewithmosh.store.orders;

import org.mapstruct.Mapper;

/**
 * @author ileanaoneata on 09.06.2025
 */

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderDto toDto(Order order);
}
