package ua.lviv.iot.zoosbackend.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.lviv.iot.zoosbackend.dto.auth.AuthenticationRequestDto;
import ua.lviv.iot.zoosbackend.dto.user.UserRegistrationDto;
import ua.lviv.iot.zoosbackend.mapper.Mapper;
import ua.lviv.iot.zoosbackend.model.User;
import ua.lviv.iot.zoosbackend.model.enums.Role;
import ua.lviv.iot.zoosbackend.security.JwtTokenProvider;
import ua.lviv.iot.zoosbackend.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

import static ua.lviv.iot.zoosbackend.mapper.Mapper.mapUserToUserDto;

@CrossOrigin(origins = "*")
@Controller
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final AuthenticationManager authenticationManager;
    private final UserService userService;
    private final JwtTokenProvider jwtTokenProvider;

    @PostMapping("/login")
    public ResponseEntity<?> authenticate(@RequestBody AuthenticationRequestDto request) {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    request.getEmail(), request.getPassword()));
        } catch (AuthenticationException e) {
            return new ResponseEntity<>("Invalid email or password", HttpStatus.FORBIDDEN);
        }
        User user = userService.getByEmail(request.getEmail());
        String token = jwtTokenProvider.createToken(request.getEmail(), user.getRole().name());
        Map<Object, Object> response = new HashMap<>();
        response.put("user", mapUserToUserDto(userService.getByEmail(request.getEmail())));
        response.put("token", token);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/register")
    public ResponseEntity<?> registration(@RequestBody UserRegistrationDto userRegistrationDto,
                                          BCryptPasswordEncoder bCryptPasswordEncoder) {
        String token = jwtTokenProvider.createToken(userRegistrationDto.getEmail(), Role.USER.name());
        Map<Object, Object> response = new HashMap<>();
        response.put("user", mapUserToUserDto(userService.save(new User(
                userRegistrationDto.getEmail(),
                bCryptPasswordEncoder.encode(userRegistrationDto.getPassword()),
                userRegistrationDto.getFirstName(),
                userRegistrationDto.getLastName()))));
        response.put("token", token);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response) {
        SecurityContextLogoutHandler securityContextLogoutHandler = new SecurityContextLogoutHandler();
        securityContextLogoutHandler.logout(request, response, null);
    }
}
