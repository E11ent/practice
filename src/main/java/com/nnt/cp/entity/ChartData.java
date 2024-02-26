package com.nnt.cp.entity;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ChartData {
    public String date;
    public int total;

    public ChartData() {
    }

    public ChartData(String date, int total) {
        this.date = date;
        this.total = total;
    }

    /**
     * 获取
     * @return date
     */
    public String getDate() {
        return date;
    }

    /**
     * 设置
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 获取
     * @return total
     */
    public int getTotal() {
        return total;
    }

    /**
     * 设置
     * @param total
     */
    public void setTotal(int total) {
        this.total = total;
    }

    public String toString() {
        return "ChartData{date = " + date + ", total = " + total + "}";
    }
}

