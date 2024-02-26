package com.nnt.cp.service.impl;

import com.nnt.cp.entity.Attraction;
import com.nnt.cp.entity.User;
import com.nnt.cp.mapper.AttractionMapper;
import com.nnt.cp.service.AttractionService;
import com.nnt.cp.service.ex.UsernameDuplicatedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttractionServiceImpl implements AttractionService {
    @Autowired
    private AttractionMapper mapper;

    @Override
    public List<Attraction> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public Boolean deleteById(int id) {
        return mapper.deleteById(id);
    }

    @Override
    public List<Attraction> selectByLevel(int level) {
        return mapper.selectByLevel(level);
    }

    @Override
    public Boolean saveAttraction(String name, int level, String introduce) {
        if (mapper.selectByName(name) != null) throw new UsernameDuplicatedException("用户名被占用！");
        else return mapper.insert(name, level, introduce) != 0;
    }

    @Override
    public Boolean updateAttraction(String name, int level, String introduce, int id) {
        return mapper.updateById(name, level, introduce, id);
    }
}
