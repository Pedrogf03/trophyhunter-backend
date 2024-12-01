package com.trophyhunter.trophyhunter_backend.service;

import com.trophyhunter.trophyhunter_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

}
