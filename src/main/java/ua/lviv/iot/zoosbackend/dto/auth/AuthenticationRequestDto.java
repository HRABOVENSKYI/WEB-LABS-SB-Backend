package ua.lviv.iot.zoosbackend.dto.auth;

import lombok.Data;

@Data
public class AuthenticationRequestDto {
    private String email;
    private String password;
}
