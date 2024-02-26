package com.nnt.cp.mapper;

import com.nnt.cp.entity.Schedule;
import com.nnt.cp.entity.Tourgroup;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

@Mapper
public interface TourgroupMapper {
    @Select("select * from tourgroup where group_id = #{id}")
    Tourgroup selectByID(int id);

    @Select("select * from tourgroup where group_name = #{name}")
    List<Tourgroup> selectByName(String name);

    @Select("select * from tourgroup")
    List<Tourgroup> selectAll();

    @Insert("insert into tourgroup(schedule_id, group_name, group_number, group_maxnumber,group_contact, group_address, group_phone) " +
            "values(#{schedule_id}, #{group_name},#{group_number}, #{group_maxnumber} ,#{group_contact}, #{group_address},#{group_phone})")
    Integer insert(int schedule_id, String group_name, int group_number,int group_maxnumber, String group_contact, String group_address, String group_phone);

    @Update("update tourgroup " +
            "set schedule_id = #{schedule_id},group_name = #{group_name}," +
            "group_number = #{group_number},group_maxnumber = #{group_maxnumber}, group_contact = #{group_contact},group_address = #{group_address}," +
            "group_phone = #{group_phone} " +
            "where group_id = #{group_id}")
    Boolean updateById(int schedule_id, String group_name, int group_number, int group_maxnumber, String group_contact, String group_address,
                       String group_phone,int group_id);

    @Delete("delete from tourgroup where group_id = #{id} ")
    Boolean deleteById(int id);
}
