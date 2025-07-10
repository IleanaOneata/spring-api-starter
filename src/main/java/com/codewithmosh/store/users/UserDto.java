package com.codewithmosh.store.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author ileanaoneata on 23.04.2025
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {

    public Long id;
    public String name;
    private String email;

}
