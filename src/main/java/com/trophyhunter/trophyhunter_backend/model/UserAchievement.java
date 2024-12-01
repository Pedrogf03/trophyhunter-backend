package com.trophyhunter.trophyhunter_backend.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAchievement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user_achievement")
    private int idUserAchievement;

    @ManyToOne
    @JoinColumn(name = "id_user_game")
    private UserGame userGame;

    @ManyToOne
    @JoinColumn(name = "id_achievement")
    private Achievement achievement;

    @Column(name = "is_completed")
    private Boolean isCompleted;

    @Column(name = "completion_date")
    private Date completionDate;
}
