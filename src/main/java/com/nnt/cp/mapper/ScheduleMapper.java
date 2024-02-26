package com.nnt.cp.mapper;

import com.nnt.cp.entity.Line;
import com.nnt.cp.entity.Schedule;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

@Mapper
public interface ScheduleMapper {
    @Select("select * from schedule where schedule_id = #{id}")
    Schedule selectByID(int id);

    @Select("select * from schedule where start_date= #{start}")
    List<Schedule> selectByStart(Date start);

    @Select("select * from schedule")
    List<Schedule> selectAll();

    @Insert("insert into schedule(line_id, start_date, end_date, pay) values(#{line_id},#{start},#{end},#{pay})")
    Integer insert(int line_id, Date start, Date end, int pay);

    @Update("update schedule set schedule_id=#{id}, start_date=#{start}, end_date=#{end}, pay=#{pay} where schedule_id = #{id}")
    Boolean updateById(int line_id, Date start, Date end, int pay, int id);

    @Delete("delete from schedule where schedule_id = #{id} ")
    Boolean deleteById(int id);
}
