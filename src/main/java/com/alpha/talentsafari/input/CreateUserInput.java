package com.alpha.talentsafari.input;

import com.alpha.talentsafari.entity.Role;
import lombok.Data;

@Data
public class CreateUserInput {
    private String email;
    private Role role;
    private String phone;
    private String picture;
}