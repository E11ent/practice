package com.nnt.cp.entity;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Schedule {
    private int schedule_id;
    public int line_id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date start_date;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date end_date;
    public int pay;

    public Schedule() {
    }

    public Schedule(int schedule_id, int line_id, Date start_date, Date end_date, int pay) {
        this.schedule_id = schedule_id;
        this.line_id = line_id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.pay = pay;
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
     * @return line_id
     */
    public int getLine_id() {
        return line_id;
    }

    /**
     * 设置
     * @param line_id
     */
    public void setLine_id(int line_id) {
        this.line_id = line_id;
    }

    /**
     * 获取
     * @return start_date
     */
    public Date getStart_date() {
        return start_date;
    }

    /**
     * 设置
     * @param start_date
     */
    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    /**
     * 获取
     * @return end_date
     */
    public Date getEnd_date() {
        return end_date;
    }

    /**
     * 设置
     * @param end_date
     */
    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    /**
     * 获取
     * @return pay
     */
    public int getPay() {
        return pay;
    }

    /**
     * 设置
     * @param pay
     */
    public void setPay(int pay) {
        this.pay = pay;
    }

    public String toString() {
        return "Schedule{schedule_id = " + schedule_id + ", line_id = " + line_id + ", start_date = " + start_date + ", end_date = " + end_date + ", pay = " + pay + "}";
    }
}
