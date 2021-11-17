package ua.lviv.iot.zoosbackend.model;

import lombok.*;
import ua.lviv.iot.zoosbackend.model.enums.ZooType;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Zoo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer numOfVisitors;

    private Integer numOfAnimals;

    @Enumerated(EnumType.STRING)
    private ZooType type;

    private Integer entranceFee;
}
