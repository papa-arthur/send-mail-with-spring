package com.alpha.talentsafari.service.impl;

import com.alpha.talentsafari.config.EntityMapper;
import com.alpha.talentsafari.dto.UserDto;
import com.alpha.talentsafari.entity.User;
import com.alpha.talentsafari.exception.EntityExistsException;
import com.alpha.talentsafari.exception.NotFoundException;
import com.alpha.talentsafari.input.CreateUserInput;
import com.alpha.talentsafari.input.UpdateUserInput;
import com.alpha.talentsafari.repository.UserRepository;
import com.alpha.talentsafari.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final EntityMapper mapper;

    @Override
    public UserDto createUser(CreateUserInput userInput) {
        if (userRepository.existsByEmail(userInput.getEmail()))
            throw new EntityExistsException(String.format("User with user email: '%s'  already exists", userInput.getEmail()));

        User newUser = mapper.inputToEntity(userInput);
        newUser.setUserId(UUID.randomUUID().toString());
        return mapper.entityToDto(userRepository.save(newUser));
    }

    @Override
    public UserDto getUserByUserId(String userId) {
        Objects.requireNonNull(userId, "UserId cannot be null");
        User user = userRepository.findByUserId(userId).orElseThrow(
                () -> new NotFoundException(String.format("User with user ID: '%s'  not found", userId))
        );
        return mapper.entityToDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        return mapper.entityToDtoList(userRepository.findAll());
    }

    @Override

    public UserDto updateUser(UpdateUserInput userInput) {
        User existingUser = userRepository.findByUserId(userInput.getUserId()).orElseThrow(
                () -> new NotFoundException(String.format("User with user ID: '%s'  not found", userInput.getUserId()))
        );
        mapper.updateFields(existingUser, userInput);
        return mapper.entityToDto(userRepository.save(existingUser));
    }
}
