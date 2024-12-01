package com.trophyhunter.trophyhunter_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class AchievementDTO {
    private Long idAchievement;
    private String name;
    private String description;
    private int rarityPercentage;
}
