package com.nnt.cp.entity;

import org.springframework.stereotype.Component;

@Component
public class Guide {
    private int guide_id;
    public String guide_name;
    public int guide_sex;
    public int guide_age;
    public String guide_idcard;
    public String guide_address;
    public String guide_phone;


    public Guide() {
    }

    public Guide(int guide_id, String guide_name, int guide_sex, int guide_age, String guide_idcard, String guide_address, String guide_phone) {
        this.guide_id = guide_id;
        this.guide_name = guide_name;
        this.guide_sex = guide_sex;
        this.guide_age = guide_age;
        this.guide_idcard = guide_idcard;
        this.guide_address = guide_address;
        this.guide_phone = guide_phone;
    }

    /**
     * 获取
     * @return guide_id
     */
    public int getGuide_id() {
        return guide_id;
    }

    /**
     * 设置
     * @param guide_id
     */
    public void setGuide_id(int guide_id) {
        this.guide_id = guide_id;
    }

    /**
     * 获取
     * @return guide_name
     */
    public String getGuide_name() {
        return guide_name;
    }

    /**
     * 设置
     * @param guide_name
     */
    public void setGuide_name(String guide_name) {
        this.guide_name = guide_name;
    }

    /**
     * 获取
     * @return guide_sex
     */
    public int getGuide_sex() {
        return guide_sex;
    }

    /**
     * 设置
     * @param guide_sex
     */
    public void setGuide_sex(int guide_sex) {
        this.guide_sex = guide_sex;
    }

    /**
     * 获取
     * @return guide_age
     */
    public int getGuide_age() {
        return guide_age;
    }

    /**
     * 设置
     * @param guide_age
     */
    public void setGuide_age(int guide_age) {
        this.guide_age = guide_age;
    }

    /**
     * 获取
     * @return guide_idcard
     */
    public String getGuide_idcard() {
        return guide_idcard;
    }

    /**
     * 设置
     * @param guide_idcard
     */
    public void setGuide_idcard(String guide_idcard) {
        this.guide_idcard = guide_idcard;
    }

    /**
     * 获取
     * @return guide_address
     */
    public String getGuide_address() {
        return guide_address;
    }

    /**
     * 设置
     * @param guide_address
     */
    public void setGuide_address(String guide_address) {
        this.guide_address = guide_address;
    }

    /**
     * 获取
     * @return guide_phone
     */
    public String getGuide_phone() {
        return guide_phone;
    }

    /**
     * 设置
     * @param guide_phone
     */
    public void setGuide_phone(String guide_phone) {
        this.guide_phone = guide_phone;
    }

    public String toString() {
        return "Guide{guide_id = " + guide_id + ", guide_name = " + guide_name + ", guide_sex = " + guide_sex + ", guide_age = " + guide_age + ", guide_idcard = " + guide_idcard + ", guide_address = " + guide_address + ", guide_phone = " + guide_phone + "}";
    }
}
