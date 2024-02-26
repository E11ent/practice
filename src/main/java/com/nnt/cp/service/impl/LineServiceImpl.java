package com.nnt.cp.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.nnt.cp.entity.Line;
import com.nnt.cp.mapper.AttractionMapper;
import com.nnt.cp.mapper.LineMapper;
import com.nnt.cp.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LineServiceImpl implements LineService {

    @Autowired
    private LineMapper lineMapper;

    @Autowired
    private AttractionMapper attractionMapper;

    @Override
    public List<Line> selectAll() {
        List<Line> list = lineMapper.selectAll();
        for (Line line : list) {
            int id = line.getLine_id();
            StringBuilder sb = new StringBuilder();
            ArrayList<String> array = lineMapper.selectAllAttractionNameByLineId(id);
            for (String s : array) {
                sb.append("{\"value\":").append("\"").append(s).append("\"").append("},");
            }
            sb.deleteCharAt(sb.length()-1);
            sb.insert(0,'[').append(']');
            line.domains = sb.toString();
        }

        return list;
    }

    @Override
    public Boolean deleteById(int id) {
        return lineMapper.deleteById(id);
    }

    @Override
    public Boolean saveLine(int day, ArrayList<String> array) {
        int line_id = 0;
        if(lineMapper.selectMaxID() == null){
            line_id = 1;
        }else line_id = lineMapper.selectMaxID() + 1;
        String start = array.get(0);
        String end = array.get(array.size()-1);
        lineMapper.insert(day,end,start);
        for (int i = 0; i < array.size(); i++) {
            int attraction_id = attractionMapper.selectIdByName(array.get(i));
            lineMapper.insertChoice(line_id,attraction_id,i);
        }
        return lineMapper.updateById(day,start,end,line_id);
    }

    @Override
    public Boolean updateLine(int day, ArrayList<String> array, int id) {
        lineMapper.deleteChoiceById(id);
        String start = array.get(0);
        String end = array.get(array.size()-1);
        for (int i = 0; i < array.size(); i++) {
            int attraction_id = attractionMapper.selectIdByName(array.get(i));
            lineMapper.insertChoice(id,attraction_id,i);
        }
        return lineMapper.updateById(day,start,end,id);
    }
}
