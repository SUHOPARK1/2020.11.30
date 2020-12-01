package com.example.doit.repositories;

import com.example.doit.domains.UserDto;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    public int insert(UserDto user);
        
}
