package com.nnt.cp.service;

import com.nnt.cp.entity.Tourist;

import java.util.List;

public interface TouristService {
    List<Tourist> selectAll();

    Boolean deleteById(int id);

    Boolean saveTourist(String name, int sex, int age, String idcard, String address, String phone);

    Boolean updateTourist(String name, int sex, int age, String idcard, String address, String phone, int id);
}
