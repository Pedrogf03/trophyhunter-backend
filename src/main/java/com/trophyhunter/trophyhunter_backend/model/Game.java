package com.trophyhunter.trophyhunter_backend.model;

import com.trophyhunter.trophyhunter_backend.dto.GameDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "game")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Game {

    @Id
    private Long idGame; // ID proporcionado por la API RAWG

    @Column(nullable = false, length = 100)
    private String title;

    @Column(length = 100)
    private String developer;

    @Column(length = 100)
    private String platform;

    @Column(length = 500)
    private String image;

    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    @ManyToMany(mappedBy = "games")
    private List<User> users = new ArrayList<>();

    public static Game toEntity(GameDTO dto) {
        if (dto == null) {
            return null;
        }
        return new Game(
                dto.getIdGame(),
                dto.getTitle(),
                dto.getDeveloper(),
                dto.getPlatform(),
                dto.getImage(),
                dto.getReleaseDate(),
                new ArrayList<>() // Inicializamos la lista vacía de usuarios
        );
    }


}
