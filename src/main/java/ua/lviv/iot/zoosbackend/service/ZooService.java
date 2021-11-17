package ua.lviv.iot.zoosbackend.service;

import ua.lviv.iot.zoosbackend.model.Zoo;

import java.util.List;

public interface ZooService {
    List<Zoo> getAllZoos();

    List<Zoo> getZoos(String[] filters);
}
