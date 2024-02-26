package com.nnt.cp.mapper;

import com.nnt.cp.entity.Attraction;
import com.nnt.cp.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AttractionMapper {
    @Select("select * from attraction where attraction_id = #{attraction_id}")
    Attraction selectByID(int attraction_id);

    @Select("select * from attraction where attraction_name = #{name}")
    Attraction selectByName(String name);

    @Select("select attraction_id from attraction where attraction_name = #{name}")
    Integer selectIdByName(String name);

    @Select("select * from attraction where attraction_level = #{level}")
    List<Attraction> selectByLevel(int level);

    @Select("select * from attraction")
    List<Attraction> selectAll();

    @Insert("insert into attraction(attraction_name, attraction_level, attraction_introduce) values(#{name},#{level},#{introduce})")
    Integer insert(String name, int level, String introduce);

    @Update("update attraction set attraction_name=#{name}, attraction_level=#{level}, attraction_introduce=#{introduce} where attraction_id = #{id}")
    Boolean updateById(String name, int level, String introduce, int id);

    @Delete("delete from attraction where attraction_name = #{name} ")
    Boolean deleteByName(String name);

    @Delete("delete from attraction where attraction_id = #{id} ")
    Boolean deleteById(int id);

}
