package com.trophyhunter.trophyhunter_backend.controller;

import com.trophyhunter.trophyhunter_backend.service.UserAchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user-achievements")
public class UserAchievementController {

    @Autowired
    private UserAchievementService userAchievementService;

}
