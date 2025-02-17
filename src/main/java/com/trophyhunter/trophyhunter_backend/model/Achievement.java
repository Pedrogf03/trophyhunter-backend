package com.trophyhunter.trophyhunter_backend.model;

import com.trophyhunter.trophyhunter_backend.dto.AchievementDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "achievement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Achievement {

    @Id
    private Long idAchievement; // ID proporcionado por la API RAWG

    @ManyToOne
    @JoinColumn(name = "id_game", nullable = false)
    private Game game;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(length = 500)
    private String description;

    @Column(name = "rarity_percentage", nullable = false)
    private Integer rarityPercentage;

    @OneToMany(mappedBy = "achievement", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserAchievement> userAchievements = new ArrayList<>();

    public static Achievement toEntity(AchievementDTO dto, Game game) {
        if (dto == null) {
            return null;
        }
        return new Achievement(
                dto.getIdAchievement(),
                game,
                dto.getName(),
                dto.getDescription(),
                dto.getRarityPercentage(),
                new ArrayList<>()
        );
    }

}
