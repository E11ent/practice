package com.nnt.cp.entity;

import org.springframework.stereotype.Component;

@Component
public class Attraction {
    private int attraction_id;
    public String attraction_name;
    public int attraction_level;
    public String attraction_introduce;

    public Attraction() {
    }


    public Attraction(int attraction_id, String attraction_name, int attraction_level, String attraction_introduce) {
        this.attraction_id = attraction_id;
        this.attraction_name = attraction_name;
        this.attraction_level = attraction_level;
        this.attraction_introduce = attraction_introduce;
    }

    /**
     * 获取
     * @return attraction_id
     */
    public int getAttraction_id() {
        return attraction_id;
    }

    /**
     * 设置
     * @param attraction_id
     */
    public void setAttraction_id(int attraction_id) {
        this.attraction_id = attraction_id;
    }

    /**
     * 获取
     * @return attraction_name
     */
    public String getAttraction_name() {
        return attraction_name;
    }

    /**
     * 设置
     * @param attraction_name
     */
    public void setAttraction_name(String attraction_name) {
        this.attraction_name = attraction_name;
    }

    /**
     * 获取
     * @return attraction_level
     */
    public int getAttraction_level() {
        return attraction_level;
    }

    /**
     * 设置
     * @param attraction_level
     */
    public void setAttraction_level(int attraction_level) {
        this.attraction_level = attraction_level;
    }

    /**
     * 获取
     * @return attraction_introduce
     */
    public String getAttraction_introduce() {
        return attraction_introduce;
    }

    /**
     * 设置
     * @param attraction_introduce
     */
    public void setAttraction_introduce(String attraction_introduce) {
        this.attraction_introduce = attraction_introduce;
    }

    public String toString() {
        return "Attraction{attraction_id = " + attraction_id + ", attraction_name = " + attraction_name + ", attraction_level = " + attraction_level + ", attraction_introduce = " + attraction_introduce + "}";
    }
}
