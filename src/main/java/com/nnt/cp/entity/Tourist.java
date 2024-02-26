package com.nnt.cp.entity;

public class Tourist {
    private int tourist_id;
    public String tourist_name;
    public int tourist_sex;
    public int tourist_age;
    public String tourist_idcard;
    public String tourist_address;
    public String tourist_phone;

    public Tourist() {
    }

    public Tourist(int tourist_id, String tourist_name, int tourist_sex, int tourist_age, String tourist_idcard, String tourist_address, String tourist_phone) {
        this.tourist_id = tourist_id;
        this.tourist_name = tourist_name;
        this.tourist_sex = tourist_sex;
        this.tourist_age = tourist_age;
        this.tourist_idcard = tourist_idcard;
        this.tourist_address = tourist_address;
        this.tourist_phone = tourist_phone;
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
     * @return tourist_name
     */
    public String getTourist_name() {
        return tourist_name;
    }

    /**
     * 设置
     * @param tourist_name
     */
    public void setTourist_name(String tourist_name) {
        this.tourist_name = tourist_name;
    }

    /**
     * 获取
     * @return tourist_sex
     */
    public int getTourist_sex() {
        return tourist_sex;
    }

    /**
     * 设置
     * @param tourist_sex
     */
    public void setTourist_sex(int tourist_sex) {
        this.tourist_sex = tourist_sex;
    }

    /**
     * 获取
     * @return tourist_age
     */
    public int getTourist_age() {
        return tourist_age;
    }

    /**
     * 设置
     * @param tourist_age
     */
    public void setTourist_age(int tourist_age) {
        this.tourist_age = tourist_age;
    }

    /**
     * 获取
     * @return tourist_idcard
     */
    public String getTourist_idcard() {
        return tourist_idcard;
    }

    /**
     * 设置
     * @param tourist_idcard
     */
    public void setTourist_idcard(String tourist_idcard) {
        this.tourist_idcard = tourist_idcard;
    }

    /**
     * 获取
     * @return tourist_address
     */
    public String getTourist_address() {
        return tourist_address;
    }

    /**
     * 设置
     * @param tourist_address
     */
    public void setTourist_address(String tourist_address) {
        this.tourist_address = tourist_address;
    }

    /**
     * 获取
     * @return tourist_phone
     */
    public String getTourist_phone() {
        return tourist_phone;
    }

    /**
     * 设置
     * @param tourist_phone
     */
    public void setTourist_phone(String tourist_phone) {
        this.tourist_phone = tourist_phone;
    }

    public String toString() {
        return "Tourist{tourist_id = " + tourist_id + ", tourist_name = " + tourist_name + ", tourist_sex = " + tourist_sex + ", tourist_age = " + tourist_age + ", tourist_idcard = " + tourist_idcard + ", tourist_address = " + tourist_address + ", tourist_phone = " + tourist_phone + "}";
    }
}
