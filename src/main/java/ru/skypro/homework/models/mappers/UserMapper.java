package ru.skypro.homework.models.mappers;

import org.mapstruct.Mapper;
import ru.skypro.homework.models.dto.CreateUserDto;
import ru.skypro.homework.models.dto.UserDto;
import ru.skypro.homework.models.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    User toUser(UserDto userDto);

    User toUser(CreateUserDto createUserDto);

    CreateUserDto toCreateUserDto(User user);

}

