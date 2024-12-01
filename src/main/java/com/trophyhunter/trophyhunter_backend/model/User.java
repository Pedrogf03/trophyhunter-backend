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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int idUser;

    private String username;
    private String email;
    private String password;

    @Column(name = "is_public")
    private Boolean isPublic;

    @Column(name = "reg_date", updatable = false)
    private Date regDate;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<UserGame> userGames;
}
