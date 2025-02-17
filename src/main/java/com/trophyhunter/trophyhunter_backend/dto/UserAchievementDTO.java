package com.trophyhunter.trophyhunter_backend.dto;

import com.trophyhunter.trophyhunter_backend.model.UserAchievement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Setter
@Getter
@AllArgsConstructor
public class UserAchievementDTO {
    private Long idUser; // ID del usuario asociado
    private Long idAchievement; // ID del logro
    private boolean isCompleted;
    private Date completionDate;

    public static UserAchievementDTO fromEntity(UserAchievement userAchievement) {
        if (userAchievement == null) {
            return null;
        }
        return new UserAchievementDTO(
                userAchievement.getUser().getIdUser().longValue(), // Convertimos Integer a Long
                userAchievement.getAchievement().getIdAchievement(),
                userAchievement.getIsCompleted(),
                userAchievement.getCompletionDate()
        );
    }

}
