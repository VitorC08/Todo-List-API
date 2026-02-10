package com.todolist.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdateDTO {

    @Size(min = 3, max = 50,  message = "O nome do usuário deve ter entre 3 e 50 caracteres")
    private String userName;

    @Email(message = "Email inválido")
    @Size(max = 100, message = "O emai-l deve ter no máximo 100 caracteres")
    private String email;
}
