package ua.lviv.iot.zoosbackend.mapper;

import ua.lviv.iot.zoosbackend.dto.user.UserDto;
import ua.lviv.iot.zoosbackend.model.User;

public class Mapper {

    private Mapper() {
    }

    public static UserDto mapUserToUserDto(User user) {
        return new UserDto(
                user.getEmail(),
                user.getFirstName(),
                user.getLastName(),
                user.getRole(),
                user.getIsBanned()
        );
    }
}
