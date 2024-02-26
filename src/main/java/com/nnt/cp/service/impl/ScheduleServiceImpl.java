package com.nnt.cp.service.impl;

import com.nnt.cp.entity.Schedule;
import com.nnt.cp.mapper.ScheduleMapper;
import com.nnt.cp.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleMapper mapper;

    @Override
    public List<Schedule> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public Boolean deleteById(int id) {
        return mapper.deleteById(id);
    }

    @Override
    public Boolean saveSchedule(int line_id, Date start, Date end, int pay) {
        return mapper.insert(line_id, start, end, pay) != 0;
    }

    @Override
    public Boolean updateSchedule(int line_id, Date start, Date end, int pay, int id) {
        return mapper.updateById(line_id,start,end,pay,id);
    }
}
