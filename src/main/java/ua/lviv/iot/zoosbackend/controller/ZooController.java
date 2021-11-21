package ua.lviv.iot.zoosbackend.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.zoosbackend.model.Zoo;
import ua.lviv.iot.zoosbackend.model.enums.ZooType;
import ua.lviv.iot.zoosbackend.service.ZooService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
@RequestMapping("/zoos")
public class ZooController {

    private final ZooService zooService;

    @GetMapping
    public List<Zoo> getAllZoos(final @RequestParam(value = "filters", required = false) String[] filters) {
        if (filters != null) {
            return filters.length != 0 ? zooService.getZoos(filters) : zooService.getAllZoos();
        }
        return zooService.getAllZoos();
    }

    @GetMapping("/types")
    public ZooType[] getAllZooTypes() {
        return ZooType.values();
    }

    @PostMapping
    public Zoo createZoo(final @RequestBody Zoo zoo) {
        return zooService.createZoo(zoo);
    }

    @PutMapping
    public Zoo updateZoo(final @RequestBody Zoo zoo) {
        return zooService.updateZoo(zoo);
    }

    @DeleteMapping("/{id}")
    public void deleteZoo(final @PathVariable("id") Integer id) {
        zooService.deleteZoo(id);
    }
}
