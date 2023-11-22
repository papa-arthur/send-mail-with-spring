package com.alpha.talentsafari.input;

import lombok.Data;

@Data
public class UpdateUserInput {
    private String userId;
    private String email;
    private String phone;
    private String picture;
}
