package com.todolist.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "tasks")
@EqualsAndHashCode(exclude = "tasks")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String userName;

    @Column(unique = true, name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "users")
    private List<TaskModel> tasks;

}
