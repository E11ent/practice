package com.nnt.cp.service.impl;

import com.nnt.cp.entity.Tourgroup;
import com.nnt.cp.mapper.TourgroupMapper;
import com.nnt.cp.service.TourgroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourgroupServiceImpl implements TourgroupService {

    @Autowired
    private TourgroupMapper mapper;

    @Override
    public List<Tourgroup> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public Boolean deleteById(int id) {
        return mapper.deleteById(id);
    }

    @Override
    public Boolean saveTourgroup(int schedule_id, String group_name, int group_number,int group_maxnumber, String group_contact, String group_address,
                                 String group_phone) {
        return mapper.insert(schedule_id, group_name, group_number,group_maxnumber, group_contact, group_address, group_phone) != 0;
    }

    @Override
    public Boolean updateTourgroup(int schedule_id, String group_name, int group_number,int group_maxnumber, String group_contact, String group_address, String group_phone, int group_id) {
        return mapper.updateById(schedule_id, group_name, group_number, group_maxnumber, group_contact, group_address, group_phone, group_id);
    }
}
