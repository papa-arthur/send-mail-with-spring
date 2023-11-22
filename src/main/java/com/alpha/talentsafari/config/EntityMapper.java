package com.alpha.talentsafari.config;

import com.alpha.talentsafari.dto.UserDto;
import com.alpha.talentsafari.entity.User;
import com.alpha.talentsafari.input.CreateUserInput;
import com.alpha.talentsafari.input.UpdateUserInput;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface EntityMapper {

    User inputToEntity(CreateUserInput userInput);
    UserDto entityToDto(User user);

    List<UserDto> entityToDtoList(List<User> all);
    @Mapping(target = "userId", ignore = true)
    void updateFields(@MappingTarget User dbUser, UpdateUserInput updateUser);
}
