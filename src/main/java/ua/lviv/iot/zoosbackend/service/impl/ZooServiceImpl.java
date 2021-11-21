package ua.lviv.iot.zoosbackend.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.lviv.iot.zoosbackend.dao.ZooDao;
import ua.lviv.iot.zoosbackend.model.Zoo;
import ua.lviv.iot.zoosbackend.model.enums.ZooType;
import ua.lviv.iot.zoosbackend.service.ZooService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ZooServiceImpl implements ZooService {

    private final ZooDao zooDao;

    @Override
    public List<Zoo> getAllZoos() {
        return zooDao.findAll();
    }

    @Override
    public List<Zoo> getZoos(String[] filters) {
        return zooDao.findZoosByFilters(Arrays.stream(filters).map(ZooType::valueOf).collect(Collectors.toList()));
    }

    @Override
    public Zoo createZoo(Zoo zoo) {
        return zooDao.save(zoo);
    }

    @Override
    public Zoo updateZoo(Zoo zoo) {
        return zooDao.save(zoo);
    }

    @Override
    public void deleteZoo(Integer id) {
        zooDao.deleteById(id);
    }
}
