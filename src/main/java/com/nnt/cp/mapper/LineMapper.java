package com.nnt.cp.mapper;

import com.nnt.cp.entity.Line;
import org.apache.ibatis.annotations.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Mapper
public interface LineMapper {
    @Select("select * from line where line_id = #{id}")
    Line selectByID(int id);

    @Select("select * from line where line_start= #{start}")
    List<Line> selectByStart(String start);

    @Select("select MAX(line_id) from line")
    Integer selectMaxID();

    @Select("select * from line")
    List<Line> selectAll();

    @Select("select attraction_name from attraction,choice " +
            "where choice.attraction_id = attraction.attraction_id and choice.line_id = #{id} order by `order`")
    ArrayList<String> selectAllAttractionNameByLineId(int id);

    @Insert("insert into line(line_day, line_end, line_start) values(#{day},#{end},#{start})")
    Integer insert(int day, String end, String start);

    @Insert("insert into choice( line_id, attraction_id, `order`) values(#{line_id},#{attraction_id},#{order})")
    Integer insertChoice(int line_id, int attraction_id, int order);

    @Update("update line set line_day=#{day}, line_start=#{start}, line_end=#{end} where line_id = #{id}")
    Boolean updateById(int day, String start, String end, int id);

    @Update("update line set line_start = #{start},line_end = #{end} where line_id = #{id}")
    Boolean updateSE(String start,String end,int id);

    @Delete("delete from line where line_id = #{id} ")
    Boolean deleteById(int id);

    @Delete("delete from choice where line_id = #{id} ")
    Boolean deleteChoiceById(int id);

}
