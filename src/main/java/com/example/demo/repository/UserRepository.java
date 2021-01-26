package com.example.demo.repository;

import com.example.demo.model.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserRepository {

    void insertUser(User user);
}
