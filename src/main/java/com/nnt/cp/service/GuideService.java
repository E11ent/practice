package com.nnt.cp.service;

import com.nnt.cp.entity.Guide;
import com.nnt.cp.entity.Line;

import java.util.List;

public interface GuideService {
    List<Guide> selectAll();

    Boolean deleteById(int id);

    Boolean saveGuide(String name, int sex, int age, String idcard, String address, String phone);

    Boolean updateGuide(String name, int sex, int age, String idcard, String address, String phone, int id);
}
