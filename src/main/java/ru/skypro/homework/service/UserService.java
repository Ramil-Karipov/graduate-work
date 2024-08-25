package ru.skypro.homework.service;


import ru.skypro.homework.dto.CreateOrUpdateAdDTO;
import ru.skypro.homework.dto.NewPasswordDTO;
import ru.skypro.homework.model.UserModel;

import java.util.List;

public interface UserService {
    CreateOrUpdateAdDTO addUser(CreateOrUpdateAdDTO user);

    List<UserModel> getUsers();

    UserModel updateUser(UserModel userModel);

    NewPasswordDTO setPassword(NewPasswordDTO newPassword);

    UserModel getUserDto(Integer id);

    UserModel getUser(Integer id);

}
