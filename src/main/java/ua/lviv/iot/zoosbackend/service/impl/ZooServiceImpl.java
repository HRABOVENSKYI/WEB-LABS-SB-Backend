package ua.lviv.iot.zoosbackend.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.lviv.iot.zoosbackend.dao.ZooDao;
import ua.lviv.iot.zoosbackend.model.Zoo;
import ua.lviv.iot.zoosbackend.service.ZooService;

import java.util.List;

@Service
@AllArgsConstructor
public class ZooServiceImpl implements ZooService {

    private final ZooDao zooDao;

    @Override
    public List<Zoo> getAllZoos() {
        return zooDao.findAll();
    }
}
