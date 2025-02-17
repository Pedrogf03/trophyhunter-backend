package com.trophyhunter.trophyhunter_backend.model;

import com.trophyhunter.trophyhunter_backend.dto.UserDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;

    @Column(nullable = false, length = 100)
    private String username;

    @Column(nullable = false, unique = true, length = 200)
    private String email;

    @Column(nullable = false, length = 500)
    private String password;

    @Column(nullable = false)
    private Boolean isPublic = true;

    @Column(name = "reg_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date regDate = new Date();

    @ManyToMany
    @JoinTable(
            name = "user_game",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_game")
    )
    private List<Game> games = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserAchievement> userAchievements = new ArrayList<>();

    public static User toEntity(UserDTO dto, String encryptedPassword) {
        if (dto == null) {
            return null;
        }
        User user = new User();
        user.setIdUser(dto.getIdUser().intValue()); // Convertimos Long a Integer
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setPassword(encryptedPassword); // Se necesita una contraseña en la entidad
        user.setIsPublic(dto.isPublic());
        user.setRegDate(dto.getRegDate());
        user.setGames(new ArrayList<>()); // Lista de juegos vacía por defecto
        user.setUserAchievements(new ArrayList<>()); // Lista de logros vacía por defecto
        return user;
    }


}
