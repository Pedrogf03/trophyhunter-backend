package com.trophyhunter.trophyhunter_backend.service;

import com.trophyhunter.trophyhunter_backend.repository.UserAchievementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAchievementService {

    @Autowired
    private UserAchievementRepository userAchievementRepository;

}
