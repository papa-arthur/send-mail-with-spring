package com.alpha.talentsafari.controller;

import com.alpha.talentsafari.dto.UserDto;
import com.alpha.talentsafari.input.CreateUserInput;
import com.alpha.talentsafari.input.UpdateUserInput;
import com.alpha.talentsafari.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @MutationMapping
    UserDto createUser(@Argument CreateUserInput userInput) {
        return userService.createUser(userInput);
    }

    @MutationMapping
    UserDto updateUser(@Argument UpdateUserInput userInput) {
        return userService.updateUser(userInput);
    }

    @QueryMapping
    UserDto getUserByUserId(@Argument String userId) {
        return userService.getUserByUserId(userId);
    }

    @QueryMapping
    List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

}
