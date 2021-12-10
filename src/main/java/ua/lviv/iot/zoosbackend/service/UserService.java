package ua.lviv.iot.zoosbackend.service;

import ua.lviv.iot.zoosbackend.model.User;

public interface UserService {
    User getByEmail(String email);

    User save(User user);
}
