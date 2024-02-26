package com.nnt.cp.service.impl;

import com.nnt.cp.entity.User;
import com.nnt.cp.mapper.UserMapper;
import com.nnt.cp.service.UserService;
import com.nnt.cp.service.ex.UsernameDuplicatedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public User login(String username, String password) {
        String psw = mapper.getPassword(username);
        if(psw != null) {
            if (psw.equals(password)) {
                mapper.updateDateByUsername(username, new Date());
                return mapper.selectByUsername(username).get(0);
            } else return null;
        } else return null;
    }

    @Override
    public List<User> selectAll() {

        return mapper.selectAll();
    }

    @Override
    public List<User> getByUsername(String username) {
        StringBuilder sb = new StringBuilder();
        sb.append("%").append(username).append("%");
        return mapper.selectByUsername(sb.toString());
    }

    @Override
    public Boolean deleteByUsername(String username) {
        return mapper.deleteByUsername(username);
    }

    @Override
    public Boolean saveUser(String username, String password,int usertype){
        if(mapper.selectByUsername(username).size() != 0) throw new UsernameDuplicatedException("用户名被占用！");
        else return mapper.insert(username,password,usertype) != 0;
    }

    @Override
    public Boolean updateUser(String username, String password, int uid, int usertype) {
        return mapper.updateByUid(username,password,uid,usertype);
    }


}
