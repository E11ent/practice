package com.nnt.cp.controller;

import com.nnt.cp.entity.Schedule;
import com.nnt.cp.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/Schedule")
public class ScheduleController {

    @Autowired
    private ScheduleService service;

    @GetMapping("/selectAll")
    List<Schedule> list() {
        return service.selectAll();
    }

    @DeleteMapping("/deleteSchedule/{id}")
    Boolean deleteById(@PathVariable("id") int id) {
        return service.deleteById(id);
    }

    @PostMapping(value="/saveSchedule",produces = "application/json")
    Boolean saveSchedule(@RequestBody Schedule schedule) {
        return service.saveSchedule(schedule.line_id,schedule.start_date,schedule.end_date,schedule.pay);
    }

    @PostMapping(value = "/updateSchedule", produces = "application/json")
    Boolean updateLine(@RequestBody Schedule schedule) {
        return service.updateSchedule(schedule.line_id,schedule.start_date,schedule.end_date,schedule.pay,schedule.getSchedule_id());
    }
}
