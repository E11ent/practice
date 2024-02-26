package com.nnt.cp.entity;

import org.springframework.stereotype.Component;

@Component
public class Tourgroup {
    private int group_id;
    public int schedule_id;
    public String group_name;
    public int group_number;
    public int group_maxnumber;
    public String group_contact;
    public String group_address;
    public String group_phone;


    public Tourgroup() {
    }

    public Tourgroup(int group_id, int schedule_id, String group_name, int group_number, int group_maxnumber, String group_contact, String group_address, String group_phone) {
        this.group_id = group_id;
        this.schedule_id = schedule_id;
        this.group_name = group_name;
        this.group_number = group_number;
        this.group_maxnumber = group_maxnumber;
        this.group_contact = group_contact;
        this.group_address = group_address;
        this.group_phone = group_phone;
    }

    /**
     * 获取
     * @return group_id
     */
    public int getGroup_id() {
        return group_id;
    }

    /**
     * 设置
     * @param group_id
     */
    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    /**
     * 获取
     * @return schedule_id
     */
    public int getSchedule_id() {
        return schedule_id;
    }

    /**
     * 设置
     * @param schedule_id
     */
    public void setSchedule_id(int schedule_id) {
        this.schedule_id = schedule_id;
    }

    /**
     * 获取
     * @return group_name
     */
    public String getGroup_name() {
        return group_name;
    }

    /**
     * 设置
     * @param group_name
     */
    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    /**
     * 获取
     * @return group_number
     */
    public int getGroup_number() {
        return group_number;
    }

    /**
     * 设置
     * @param group_number
     */
    public void setGroup_number(int group_number) {
        this.group_number = group_number;
    }

    /**
     * 获取
     * @return group_maxnumber
     */
    public int getGroup_maxnumber() {
        return group_maxnumber;
    }

    /**
     * 设置
     * @param group_maxnumber
     */
    public void setGroup_maxnumber(int group_maxnumber) {
        this.group_maxnumber = group_maxnumber;
    }

    /**
     * 获取
     * @return group_contact
     */
    public String getGroup_contact() {
        return group_contact;
    }

    /**
     * 设置
     * @param group_contact
     */
    public void setGroup_contact(String group_contact) {
        this.group_contact = group_contact;
    }

    /**
     * 获取
     * @return group_address
     */
    public String getGroup_address() {
        return group_address;
    }

    /**
     * 设置
     * @param group_address
     */
    public void setGroup_address(String group_address) {
        this.group_address = group_address;
    }

    /**
     * 获取
     * @return group_phone
     */
    public String getGroup_phone() {
        return group_phone;
    }

    /**
     * 设置
     * @param group_phone
     */
    public void setGroup_phone(String group_phone) {
        this.group_phone = group_phone;
    }

    public String toString() {
        return "Tourgroup{group_id = " + group_id + ", schedule_id = " + schedule_id + ", group_name = " + group_name + ", group_number = " + group_number + ", group_maxnumber = " + group_maxnumber + ", group_contact = " + group_contact + ", group_address = " + group_address + ", group_phone = " + group_phone + "}";
    }
}
