package com.codewithmosh.store.mappers;

import com.codewithmosh.store.dtos.UserDto;
import com.codewithmosh.store.entities.User;
import org.mapstruct.Mapper;

/**
 * @author ileanaoneata on 23.04.2025
 */

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);
}
