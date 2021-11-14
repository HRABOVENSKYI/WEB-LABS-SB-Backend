package ua.lviv.iot.zoosbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.zoosbackend.model.Zoo;

@Repository
public interface ZooDao extends JpaRepository<Zoo, Integer> {
}
