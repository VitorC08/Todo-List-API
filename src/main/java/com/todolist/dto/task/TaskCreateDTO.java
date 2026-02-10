package com.todolist.dto.task;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskCreateDTO {

    @NotBlank(message = "O título não pode ser vazio")
    private String title;

    private String description;

    private String status;

}
