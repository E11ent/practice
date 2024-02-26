package com.nnt.cp.entity;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class Line {
    private int line_id;
    public int line_day;
    public String line_start;
    public String line_end;
    public String domains;
    public Line() {
    }

    public Line(int line_id, int line_day, String line_start, String line_end) {
        this.line_id = line_id;
        this.line_day = line_day;
        this.line_start = line_start;
        this.line_end = line_end;
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
     * @return line_day
     */
    public int getLine_day() {
        return line_day;
    }

    /**
     * 设置
     * @param line_day
     */
    public void setLine_day(int line_day) {
        this.line_day = line_day;
    }

    /**
     * 获取
     * @return line_start
     */
    public String getLine_start() {
        return line_start;
    }

    /**
     * 设置
     * @param line_start
     */
    public void setLine_start(String line_start) {
        this.line_start = line_start;
    }

    /**
     * 获取
     * @return line_end
     */
    public String getLine_end() {
        return line_end;
    }

    /**
     * 设置
     * @param line_end
     */
    public void setLine_end(String line_end) {
        this.line_end = line_end;
    }

    public String toString() {
        return "Line{line_id = " + line_id + ", line_day = " + line_day + ", line_start = " + line_start + ", line_end = " + line_end + "}";
    }
}
