package com.codewithmosh.store.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author ileanaoneata on 23.04.2025
 */

@AllArgsConstructor
@Getter
public class UserDto {

    public Long id;
    public String name;
    private String email;

}
