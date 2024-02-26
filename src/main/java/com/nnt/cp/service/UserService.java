package com.nnt.cp.service;

import com.nnt.cp.entity.User;

import java.util.List;

public interface UserService {
    User login(String username,String password);

    List<User> selectAll();
    List<User> getByUsername(String username);
    Boolean deleteByUsername(String username);

    Boolean saveUser(String username,String password,int usertype);

    Boolean updateUser(String username,String password,int uid,int usertype);
}
