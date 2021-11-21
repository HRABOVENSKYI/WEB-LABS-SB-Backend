package ua.lviv.iot.zoosbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.zoosbackend.model.Zoo;
import ua.lviv.iot.zoosbackend.model.enums.ZooType;

import java.util.List;

@Repository
public interface ZooDao extends JpaRepository<Zoo, Integer> {
    @Query("select zoo from Zoo zoo where zoo.type in :sqlFiltersList")
    List<Zoo> findZoosByFilters(List<ZooType> sqlFiltersList);

    void deleteById(Integer id);
}
