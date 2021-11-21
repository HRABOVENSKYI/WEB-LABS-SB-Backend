package ua.lviv.iot.zoosbackend.service;

import ua.lviv.iot.zoosbackend.model.Zoo;

import java.util.List;

public interface ZooService {
    List<Zoo> getAllZoos();

    List<Zoo> getZoos(String[] filters);

    Zoo createZoo(Zoo zoo);

    Zoo updateZoo(Zoo zoo);

    void deleteZoo(Integer id);
}
