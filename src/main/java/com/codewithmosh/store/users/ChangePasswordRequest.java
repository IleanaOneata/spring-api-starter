package com.codewithmosh.store.users;

import lombok.Data;

/**
 * @author ileanaoneata on 08.05.2025
 */

@Data
public class ChangePasswordRequest {

    private String oldPassword;
    private String newPassword;
}
