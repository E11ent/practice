package com.nnt.cp.controller;

import com.nnt.cp.entity.Tourgroup;
import com.nnt.cp.service.TourgroupService;
import com.nnt.cp.service.impl.CommonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/Common")
public class CommonController {

    @Autowired
    private CommonServiceImpl service;

    @GetMapping("getTodayBuy")
    Integer getTodayBuy(){
        return service.countTodayPay();
    }

    @GetMapping("getMonthBuy")
    Integer getMonthBuy(){
        return service.countMonthPay();
    }

    @GetMapping("getChartData")
    String getChartData(){
        return service.getChartData();
    }
}
