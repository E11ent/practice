package com.nnt.cp.service.impl;

import com.nnt.cp.entity.Guide;
import com.nnt.cp.mapper.GuideMapper;
import com.nnt.cp.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuideServiceImpl implements GuideService {

    @Autowired
    private GuideMapper mapper;

    @Override
    public List<Guide> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public Boolean deleteById(int id) {
        return mapper.deleteById(id);
    }

    @Override
    public Boolean saveGuide(String name, int sex, int age, String idcard, String address, String phone) {
        return mapper.insert(name,sex,age,idcard,address,phone)!= 0;
    }

    @Override
    public Boolean updateGuide(String name, int sex, int age, String idcard, String address, String phone, int id) {
        return mapper.updateById(name,sex,age,idcard,address,phone,id);
    }
}
