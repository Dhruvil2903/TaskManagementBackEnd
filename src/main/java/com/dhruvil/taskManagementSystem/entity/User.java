package com.dhruvil.taskManagementSystem.entity;

import com.dhruvil.taskManagementSystem.enums.UserEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Users")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserEnum userEnum;

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    private List<Task> task;
}
