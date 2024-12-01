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
public class Game {
    @Id
    @Column(name = "id_game")
    private Long idGame;

    private String title;
    private String developer;
    private String platform;
    private String image;

    @Column(name = "release_date")
    private Date releaseDate;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Achievement> achievements;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<UserGame> userGames;
}
