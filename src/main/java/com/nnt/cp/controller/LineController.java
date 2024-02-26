package com.nnt.cp.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import com.nnt.cp.entity.Line;
import com.nnt.cp.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/Line")
public class LineController {

    @Autowired
    private LineService service;

    @GetMapping("/selectAll")
    List<Line> list() {
        return service.selectAll();
    }

    @DeleteMapping("/deleteLine/{id}")
    Boolean deleteById(@PathVariable("id") int id) {
        return service.deleteById(id);
    }

    @PostMapping(value = "/saveLine")
    Boolean saveLine(int line_day, String domains) {
        JSONArray jsonArray = JSONArray.parseArray(domains);
        ArrayList<String> array = new ArrayList<>();
        for (Object o : jsonArray) {
            JSONObject obj = (JSONObject) o;
            array.add((String) obj.get("value"));
        }

        return service.saveLine(line_day, array);
    }

    @PostMapping(value = "/updateLine")
    Boolean updateLine(int line_id, int line_day, String domains) {
        JSONArray jsonArray = JSONArray.parseArray(domains);
        ArrayList<String> array = new ArrayList<>();
        for (Object o : jsonArray) {
            JSONObject obj = (JSONObject) o;
            array.add((String) obj.get("value"));
        }
        return service.updateLine(line_day, array, line_id);
    }
}
