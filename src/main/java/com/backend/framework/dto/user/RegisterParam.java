package com.backend.framework.dto.user;

import lombok.Data;

@Data
public class RegisterParam {
    String username;
    String password;
    String agpassword;
    String role;
}
