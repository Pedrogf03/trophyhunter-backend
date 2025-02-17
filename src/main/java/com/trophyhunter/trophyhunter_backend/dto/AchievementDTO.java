package com.trophyhunter.trophyhunter_backend.dto;

import com.trophyhunter.trophyhunter_backend.model.Achievement;
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

    public static AchievementDTO fromEntity(Achievement achievement) {
        if (achievement == null) {
            return null;
        }
        return new AchievementDTO(
                achievement.getIdAchievement(),
                achievement.getName(),
                achievement.getDescription(),
                achievement.getRarityPercentage()
        );
    }

}
