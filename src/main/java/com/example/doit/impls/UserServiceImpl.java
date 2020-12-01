package com.example.doit.impls;

import com.example.doit.domains.UserDto;
import com.example.doit.repositories.UserRepository;
import com.example.doit.services.UerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UerService {
    @Autowired UserRepository userRepository;
    @Override
    public int join(UserDto user) {
        return userRepository.insert(user);
    }
    
}
