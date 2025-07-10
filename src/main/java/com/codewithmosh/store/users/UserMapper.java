package com.codewithmosh.store.users;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

/**
 * @author ileanaoneata on 23.04.2025
 */

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User  toEntity(RegisterUserRequest request);

    void update(UpdateUserRequest request, @MappingTarget User user);
}
