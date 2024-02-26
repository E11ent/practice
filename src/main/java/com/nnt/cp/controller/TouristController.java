package com.nnt.cp.controller;

import com.nnt.cp.entity.Tourist;
import com.nnt.cp.service.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/Tourist")
public class TouristController {
    @Autowired
    private TouristService service;

    @GetMapping("/selectAll")
    List<Tourist> list() {
        return service.selectAll();
    }

    @DeleteMapping("/deleteTourist/{id}")
    Boolean deleteById(@PathVariable("id") int id) {
        return service.deleteById(id);
    }

    @PostMapping("/saveTourist")
    Boolean saveTourist(String tourist_name, int tourist_sex, int tourist_age, String tourist_idcard, String tourist_address, String tourist_phone) {
        return service.saveTourist(tourist_name,tourist_sex,tourist_age,tourist_idcard,tourist_address,tourist_phone);
    }

    @PostMapping(value = "/updateTourist", produces = "application/json")
    Boolean updateTourist(@RequestBody Tourist tourist) {
        return service.updateTourist(tourist.tourist_name,tourist.tourist_sex,tourist.tourist_age,tourist.tourist_idcard,tourist.tourist_address,
                tourist.tourist_phone,
                tourist.getTourist_id());
    }
}
