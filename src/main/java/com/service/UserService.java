package com.service;

import com.pojo.Users;

import java.util.List;

public interface UserService {

    List<Users> Find(String name, Integer age) throws Exception;
    Integer add(String name, Integer age, String pwd);

}
