package com.nnt.cp.service.impl;

import com.nnt.cp.entity.Tourist;
import com.nnt.cp.mapper.TouristMapper;
import com.nnt.cp.service.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristServiceImpl implements TouristService {

    @Autowired
    private TouristMapper mapper;

    @Override
    public List<Tourist> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public Boolean deleteById(int id) {
        return mapper.deleteById(id);
    }

    @Override
    public Boolean saveTourist(String name, int sex, int age, String idcard, String address, String phone) {
        return mapper.insert(name,sex,age,idcard,address,phone)!= 0;
    }

    @Override
    public Boolean updateTourist(String name, int sex, int age, String idcard, String address, String phone, int id) {
        return mapper.updateById(name,sex,age,idcard,address,phone,id);
    }
}
