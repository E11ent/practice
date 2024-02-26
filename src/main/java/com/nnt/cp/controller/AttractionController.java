package com.nnt.cp.controller;

import com.nnt.cp.entity.Attraction;
import com.nnt.cp.entity.User;
import com.nnt.cp.service.AttractionService;
import com.nnt.cp.service.impl.AttractionServiceImpl;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/Attraction")
public class AttractionController extends BaseController{

    @Autowired
    private AttractionService service;


    @GetMapping("/selectAll")
    List<Attraction> list(){return service.selectAll();}

    @DeleteMapping("/deleteAttraction/{id}")
    Boolean deleteById(@PathVariable("id")String id){
        return service.deleteById(Integer.parseInt(id));
    }

    @GetMapping("/getByLevel")
    List<Attraction> getByLevel(int level){

        return service.selectByLevel(level);
    }

    @PostMapping("/saveAttraction")
    Boolean saveAttraction(String attraction_name,int attraction_level,String attraction_introduce){
        return service.saveAttraction(attraction_name, attraction_level,attraction_introduce);
    }

    @PostMapping(value = "/updateAttraction",produces = "application/json")
    Boolean updateAttraction(@RequestBody Attraction attraction){
        return service.updateAttraction(attraction.attraction_name,attraction.attraction_level,attraction.attraction_introduce, attraction.getAttraction_id());
    }
}
