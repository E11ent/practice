package com.nnt.cp.controller;

import com.mysql.cj.log.Log;
import com.nnt.cp.entity.User;
import com.nnt.cp.mapper.UserMapper;
import com.nnt.cp.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/User")
public class UserController extends BaseController{

    @Autowired
    private UserService service;

    @PostMapping("/login")
    User login(String username,String password){
        return service.login(username,password);
    }

    @GetMapping("/selectAll")
    List<User> list(){return service.selectAll();}


    @DeleteMapping("/deleteUser/{username}")
    Boolean deleteByUsername(@PathVariable("username")String username){
        return service.deleteByUsername(username);
    }

    @GetMapping("/getByUserType")
    Boolean getByUserType(int usertype){
        return true;
    }

    @GetMapping("/getByUsername")
    List<User> getByUsername(String username, HttpServletResponse response) throws IOException {
        if(Objects.equals(username, "")) response.sendRedirect("selectAll");
        return service.getByUsername(username);
    }

    @PostMapping("/saveUser")
    Boolean saveUser(String username,String password,int usertype){
        return service.saveUser(username, password,usertype);
    }

    @PostMapping(value = "/updateUser",produces = "application/json")
    Boolean updateUser(@RequestBody User user){
        System.out.println(user);
        return service.updateUser(user.username,user.getPassword(),user.getUid(),user.usertype);
    }
}
