package com.nnt.cp.mapper;

import com.nnt.cp.entity.ChartData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

@Mapper
public interface CommonMapper {

    @Select("select sum(pay) from application,schedule,tourgroup " +
            "where application.group_id = tourgroup.group_id and " +
            "tourgroup.schedule_id = schedule.schedule_id and to_days(application.time) = to_days(now())")
    Integer countTodayPay();

    @Select("select MAX(time) from application")
    Date selectMaxTime();

    @Select("select sum(pay) from application,schedule,tourgroup " +
            "where application.group_id = tourgroup.group_id and " +
            "tourgroup.schedule_id = schedule.schedule_id and DATE_FORMAT( application.time, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' )")
    Integer countMonthPay();

    @Select("select DATE_FORMAT(application.time, '%Y-%m') as date, sum(pay) as total  from application,schedule,tourgroup " +
            "where application.group_id = tourgroup.group_id and " +
            "tourgroup.schedule_id = schedule.schedule_id GROUP BY DATE_FORMAT(application.time, '%Y-%m') ")
    List<ChartData> getChartData();
}
