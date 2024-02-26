package com.nnt.cp.service.impl;

import com.nnt.cp.entity.ChartData;
import com.nnt.cp.mapper.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CommonServiceImpl {

    @Autowired
    private CommonMapper mapper;

    public Integer countTodayPay(){
        return mapper.countTodayPay();
    }

    public Integer countMonthPay(){
        return mapper.countMonthPay();
    }

    public String getChartData(){
        List<ChartData> list = mapper.getChartData();
        StringBuilder sb = new StringBuilder();
        for (ChartData chartData : list) {
            sb.append("{\"").append(chartData.date).append("\":").append("\"").append(chartData.total).append("\"").append("},");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.insert(0,'[').append(']');
        return sb.toString();
    }
}
