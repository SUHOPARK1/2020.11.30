package com.example.doit.services;

import com.example.doit.domains.UserDto;

import org.springframework.stereotype.Component;

@Component
public interface UerService {
    public int join(UserDto user);
    
}
