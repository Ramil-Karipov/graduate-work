package ru.skypro.homework.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class LoginDTO {
    @NotBlank
    @Email
    @Size(min = 4, max = 32, message = "E-mail should be valid and it's length should be between 8 and 16 symbols")
    private String username;

    @NotBlank
    @Size(min = 8, max = 16, message = "Password length should be between 8 and 16 symbols")
    private String password;
}
