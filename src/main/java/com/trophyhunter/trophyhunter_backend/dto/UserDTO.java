package com.trophyhunter.trophyhunter_backend.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {
    private Long idUser;
    private String username;
    private String email;
    private boolean isPublic;
    private Date regDate;
}
