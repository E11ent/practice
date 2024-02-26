package com.nnt.cp.controller;

import com.nnt.cp.entity.Guide;
import com.nnt.cp.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/Guide")
public class GuideController {
    @Autowired
    private GuideService service;

    @GetMapping("/selectAll")
    List<Guide> list() {
        return service.selectAll();
    }

    @DeleteMapping("/deleteGuide/{id}")
    Boolean deleteById(@PathVariable("id") int id) {
        return service.deleteById(id);
    }

    @PostMapping("/saveGuide")
    Boolean saveGuide(String guide_name, int guide_sex, int guide_age, String guide_idcard, String guide_address, String guide_phone) {
        return service.saveGuide(guide_name,guide_sex,guide_age,guide_idcard,guide_address,guide_phone);
    }

    @PostMapping(value = "/updateGuide", produces = "application/json")
    Boolean updateGuide(@RequestBody Guide guide) {
        return service.updateGuide(guide.guide_name,guide.guide_sex,guide.guide_age,guide.guide_idcard,guide.guide_address,guide.guide_phone,
                guide.getGuide_id());
    }
}
