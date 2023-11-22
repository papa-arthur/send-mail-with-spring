package com.alpha.talentsafari.service;

import com.alpha.talentsafari.dto.UserDto;
import com.alpha.talentsafari.input.CreateUserInput;
import com.alpha.talentsafari.input.UpdateUserInput;

import java.util.List;

public interface UserService {
    UserDto createUser(CreateUserInput userInput);

    UserDto getUserByUserId(String userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UpdateUserInput userInput);
}
