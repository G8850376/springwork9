package com.dao;

import com.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<Users> Find(@Param("name") String name, @Param("age") Integer age);

    Integer add(@Param("name") String name, @Param("age") Integer age, @Param("pwd") String pwd);

}
