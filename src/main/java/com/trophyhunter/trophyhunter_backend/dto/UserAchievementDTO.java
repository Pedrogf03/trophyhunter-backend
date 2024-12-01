package com.trophyhunter.trophyhunter_backend.dto;

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
}
