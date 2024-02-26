package com.nnt.cp.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    private int tourist_id;
    public String username;
    private String password;
    public int usertype;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date last_login;

    public User() {
    }

    public User(int uid, int tourist_id, String username, String password, int usertype, Date last_login) {
        this.uid = uid;
        this.tourist_id = tourist_id;
        this.username = username;
        this.password = password;
        this.usertype = usertype;
        this.last_login = last_login;
    }

    /**
     * 获取
     * @return uid
     */
    public int getUid() {
        return uid;
    }

    /**
     * 设置
     * @param uid
     */
    public void setUid(int uid) {
        this.uid = uid;
    }

    /**
     * 获取
     * @return tourist_id
     */
    public int getTourist_id() {
        return tourist_id;
    }

    /**
     * 设置
     * @param tourist_id
     */
    public void setTourist_id(int tourist_id) {
        this.tourist_id = tourist_id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return usertype
     */
    public int getUsertype() {
        return usertype;
    }

    /**
     * 设置
     * @param usertype
     */
    public void setUsertype(int usertype) {
        this.usertype = usertype;
    }

    /**
     * 获取
     * @return last_login
     */
    public Date getLast_login() {
        return last_login;
    }

    /**
     * 设置
     * @param last_login
     */
    public void setLast_login(Date last_login) {
        this.last_login = last_login;
    }

    public String toString() {
        return "User{uid = " + uid + ", tourist_id = " + tourist_id + ", username = " + username + ", password = " + password + ", usertype = " + usertype + ", last_login = " + last_login + "}";
    }
}
