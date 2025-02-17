package com.trophyhunter.trophyhunter_backend.dto;

import com.trophyhunter.trophyhunter_backend.model.User;
import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {
    private Long idUser;
    private String username;
    private String email;
    private boolean isPublic;
    private Date regDate;

    public static UserDTO fromEntity(User user) {
        if (user == null) {
            return null;
        }
        UserDTO dto = new UserDTO();
        dto.setIdUser(user.getIdUser().longValue()); // Convertimos Integer a Long
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        dto.setPublic(user.getIsPublic());
        dto.setRegDate(user.getRegDate());
        return dto;
    }

}
