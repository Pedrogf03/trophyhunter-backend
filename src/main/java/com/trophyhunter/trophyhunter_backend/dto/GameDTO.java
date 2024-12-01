package com.trophyhunter.trophyhunter_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
public class GameDTO {
    private Long idGame;
    private String title;
    private String developer;
    private String platform;
    private String image;
    private Date releaseDate;
}
