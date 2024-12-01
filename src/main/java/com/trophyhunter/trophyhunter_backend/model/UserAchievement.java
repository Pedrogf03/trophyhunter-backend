package com.trophyhunter.trophyhunter_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "user_achievement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAchievement {

    @EmbeddedId
    private UserAchievementId id;

    @ManyToOne
    @MapsId("userId") // Vincula la clave primaria compuesta con el campo user
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @ManyToOne
    @MapsId("achievementId") // Vincula la clave primaria compuesta con el campo achievement
    @JoinColumn(name = "id_achievement", nullable = false)
    private Achievement achievement;

    @Column(name = "is_completed", nullable = false)
    private Boolean isCompleted = false;

    @Temporal(TemporalType.DATE)
    @Column(name = "completion_date")
    private Date completionDate;
}
