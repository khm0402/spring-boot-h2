package com.example.demo.service;

import com.example.demo.model.UserDto;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public void createUser(UserDto userDto) {
        userRepository.insertUser(userDto.toEntity());
    }

}
