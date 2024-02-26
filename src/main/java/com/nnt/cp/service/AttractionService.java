package com.nnt.cp.service;

import com.nnt.cp.entity.Attraction;
import com.nnt.cp.entity.User;

import java.util.List;

public interface AttractionService {
    List<Attraction> selectAll();

    Boolean deleteById(int id);

    List<Attraction> selectByLevel(int level);
    Boolean saveAttraction(String attraction_name, int attraction_level, String attraction_introduce);

    Boolean updateAttraction(String attraction_name, int attraction_level, String attraction_introduce, int attraction_id);
}
