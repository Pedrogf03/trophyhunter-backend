package com.trophyhunter.trophyhunter_backend.service;

import com.trophyhunter.trophyhunter_backend.repository.AchievementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AchievementService {

    @Autowired
    private AchievementRepository achievementRepository;

}
