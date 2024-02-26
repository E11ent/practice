package com.nnt.cp.service;

import com.nnt.cp.entity.Schedule;
import com.nnt.cp.entity.Tourgroup;

import java.util.Date;
import java.util.List;

public interface TourgroupService {
    List<Tourgroup> selectAll();

    Boolean deleteById(int id);

    Boolean saveTourgroup(int schedule_id, String group_name, int group_number, int group_maxnumber, String group_contact, String group_address,
                          String group_phone);

    Boolean updateTourgroup(int schedule_id, String group_name, int group_number, int group_maxnumber, String group_contact, String group_address,
                            String group_phone,int group_id);
}
