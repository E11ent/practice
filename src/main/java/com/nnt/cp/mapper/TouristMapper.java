package com.nnt.cp.mapper;

import com.nnt.cp.entity.Tourist;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TouristMapper {
    @Select("select * from tourist where tourist_id = #{id}")
    Tourist selectByID(int id);

    @Select("select * from tourist where tourist_name= #{name}")
    List<Tourist> selectByName(String name);

    @Select("select * from tourist")
    List<Tourist> selectAll();

    @Insert("insert into tourist(tourist_name, tourist_sex, tourist_age, tourist_idcard, tourist_address, tourist_phone) values(#{name},#{sex},#{age}," +
            "#{idcard}," +
            "#{address}," +
            "#{phone})")
    Integer insert(String name, int sex, int age, String idcard, String address, String phone);

    @Update("update tourist set tourist_name=#{name}, tourist_sex=#{sex}, tourist_age=#{age}, tourist_idcard=#{idcard}, tourist_address=#{address}, " +
            "tourist_phone=#{phone} " +
            "where tourist_id = #{id}")
    Boolean updateById(String name, int sex, int age, String idcard, String address, String phone, int id);

    @Delete("delete from tourist where tourist_id = #{id} ")
    Boolean deleteById(int id);
}
