package com.trophyhunter.trophyhunter_backend.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserGame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user_game")
    private int idUserGame;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_game")
    private Game game;

    private int progress;

    @Column(name = "added_date", updatable = false)
    private Date addedDate;

    @OneToMany(mappedBy = "userGame", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<UserAchievement> userAchievements;
}
