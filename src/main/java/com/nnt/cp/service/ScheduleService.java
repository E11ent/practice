package com.nnt.cp.service;

import com.nnt.cp.entity.Line;
import com.nnt.cp.entity.Schedule;

import java.util.Date;
import java.util.List;

public interface ScheduleService {
    List<Schedule> selectAll();

    Boolean deleteById(int id);

    Boolean saveSchedule(int line_id, Date start, Date end, int pay);

    Boolean updateSchedule(int line_id, Date start, Date end, int pay, int id);
}
