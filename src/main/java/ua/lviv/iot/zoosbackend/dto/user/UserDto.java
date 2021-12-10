package ua.lviv.iot.zoosbackend.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import ua.lviv.iot.zoosbackend.model.enums.Role;

@Data
@AllArgsConstructor
public class UserDto {
    private String email;
    private String firstName;
    private String lastName;
    private Role role;
    private boolean isBanned;
}
