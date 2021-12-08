package ua.lviv.iot.zoosbackend.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ua.lviv.iot.zoosbackend.dao.UserDao;
import ua.lviv.iot.zoosbackend.model.User;
import ua.lviv.iot.zoosbackend.service.UserService;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Override
    public User getByEmail(String email) {
        return userDao.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("User doesn't exists"));
    }
}
