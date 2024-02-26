package com.nnt.cp.service;

import com.nnt.cp.entity.Attraction;
import com.nnt.cp.entity.Line;

import java.util.ArrayList;
import java.util.List;

public interface LineService {
    List<Line> selectAll();

    Boolean deleteById(int id);

    Boolean saveLine(int day, ArrayList<String> array);

    Boolean updateLine(int day, ArrayList<String> array, int id);
}
