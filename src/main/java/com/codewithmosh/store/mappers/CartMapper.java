package com.codewithmosh.store.mappers;

import com.codewithmosh.store.dtos.CartDto;
import com.codewithmosh.store.entities.Cart;
import org.mapstruct.Mapper;

/**
 * @author ileanaoneata on 12.05.2025
 */
@Mapper(componentModel = "spring")
public interface CartMapper {

    CartDto toDto(Cart cart);
}
