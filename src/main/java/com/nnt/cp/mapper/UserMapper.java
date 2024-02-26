package com.nnt.cp.mapper;

import com.nnt.cp.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user where uid = #{uid}")
    User selectByID(int uid);

    @Select("select * from user where username like #{username}")
    List<User> selectByUsername(String username);

    @Select("select * from user where usertype = #{usertype}")
    User selectByUserType(int usertype);

    @Select("select password from user where username = #{username}")
    String getPassword(String username);

    @Select("select * from user")
    List<User> selectAll();

    @Insert("insert into user(username,password,usertype) values(#{username},#{password},#{usertype})")
    Integer insert(String username, String password, int usertype);

    @Update("update user set username=#{username}, password=#{password}, usertype=#{usertype} where uid = #{uid}")
    Boolean updateByUid(String username, String password, int uid, int usertype);

    @Update("update user set last_login=#{date} where username=#{username}")
    Boolean updateDateByUsername(String username, Date date);

    @Delete("delete from user where username = #{username} ")
    Boolean deleteByUsername(String username);

    @Delete("delete from user where uid = #{uid} ")
    Boolean deleteByUid(int uid);
}
