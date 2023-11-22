package com.alpha.talentsafari.dto;

import com.alpha.talentsafari.entity.Role;
import lombok.Data;

@Data
public class UserDto {
    private String userId;
    private String email;
    private String phone;
    private Role role;
    private String picture;
}
