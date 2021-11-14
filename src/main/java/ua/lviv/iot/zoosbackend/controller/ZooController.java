package ua.lviv.iot.zoosbackend.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.zoosbackend.model.Zoo;
import ua.lviv.iot.zoosbackend.service.ZooService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
@RequestMapping("/zoos")
public class ZooController {

    private final ZooService zooService;

    @GetMapping
    public List<Zoo> getAllZoos() {
        return zooService.getAllZoos();
    }
}
