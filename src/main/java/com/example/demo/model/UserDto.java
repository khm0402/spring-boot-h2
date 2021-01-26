package com.example.demo.model;

import com.example.demo.model.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private String firstName;

    private String lastName;

    public User toEntity() {
        return User.builder()
                .firstName(firstName)
                .lastName(lastName)
                .build();
    }

}
