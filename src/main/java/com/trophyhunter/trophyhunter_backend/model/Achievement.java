package com.trophyhunter.trophyhunter_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "achievement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Achievement {

    @Id
    @Column(name = "id_achievement")
    private Long idAchievement;

    @ManyToOne
    @JoinColumn(name = "id_game", referencedColumnName = "id_game")
    private Game game;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "rarity_percentage")
    private int rarityPercentage;
}

