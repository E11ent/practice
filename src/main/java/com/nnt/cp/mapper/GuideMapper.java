package com.nnt.cp.mapper;

import com.nnt.cp.entity.Guide;
import com.nnt.cp.entity.Line;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GuideMapper {
    @Select("select * from guide where guide_id = #{id}")
    Guide selectByID(int id);

    @Select("select * from guide where guide_name= #{name}")
    List<Guide> selectByName(String name);

    @Select("select * from guide")
    List<Guide> selectAll();

    @Insert("insert into guide(guide_name, guide_sex, guide_age, guide_idcard, guide_address, guide_phone) values(#{name},#{sex},#{age},#{idcard},#{address}," +
            "#{phone})")
    Integer insert(String name, int sex, int age, String idcard, String address, String phone);

    @Update("update guide set guide_name=#{name}, guide_sex=#{sex}, guide_age=#{age}, guide_idcard=#{idcard}, guide_address=#{address}, guide_phone=#{phone} " +
            "where guide_id = #{id}")
    Boolean updateById(String name, int sex, int age, String idcard, String address, String phone, int id);

    @Delete("delete from guide where guide_id = #{id} ")
    Boolean deleteById(int id);
}
