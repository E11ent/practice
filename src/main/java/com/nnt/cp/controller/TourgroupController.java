package com.nnt.cp.controller;

import com.nnt.cp.entity.Schedule;
import com.nnt.cp.entity.Tourgroup;
import com.nnt.cp.service.ScheduleService;
import com.nnt.cp.service.TourgroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/Tourgroup")
public class TourgroupController {

    @Autowired
    private TourgroupService service;

    @GetMapping("/selectAll")
    List<Tourgroup> list() {
        return service.selectAll();
    }

    @DeleteMapping("/deleteTourgroup/{id}")
    Boolean deleteById(@PathVariable("id") int id) {
        return service.deleteById(id);
    }

    @PostMapping(value= "/saveTourgroup",produces = "application/json")
    Boolean saveTourgroup(@RequestBody Tourgroup tourgroup) {
        return service.saveTourgroup(tourgroup.schedule_id,tourgroup.group_name,tourgroup.group_number,tourgroup.group_maxnumber,tourgroup.group_contact,
                tourgroup.group_address,tourgroup.group_phone);
    }

    @PostMapping(value = "/updateTourgroup", produces = "application/json")
    Boolean updateLine(@RequestBody Tourgroup tourgroup) {
        return service.updateTourgroup(tourgroup.schedule_id, tourgroup.group_name, tourgroup.group_number, tourgroup.group_maxnumber, tourgroup.group_contact,
                tourgroup.group_address,
                tourgroup.group_phone, tourgroup.getGroup_id());
    }

}
