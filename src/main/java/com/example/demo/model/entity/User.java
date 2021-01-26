package com.example.demo.model.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class User {

    private String userSeq;

    private String firstName;

    private String lastName;

}
