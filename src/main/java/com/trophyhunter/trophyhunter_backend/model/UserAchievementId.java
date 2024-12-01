package com.trophyhunter.trophyhunter_backend.model;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class UserAchievementId implements Serializable {

    private Integer userId;
    private Long achievementId;

}
