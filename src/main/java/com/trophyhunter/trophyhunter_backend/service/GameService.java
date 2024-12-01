package com.trophyhunter.trophyhunter_backend.service;

import com.trophyhunter.trophyhunter_backend.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

}
