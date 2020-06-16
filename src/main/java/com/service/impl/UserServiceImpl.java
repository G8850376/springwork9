package com.service.impl;


import com.dao.UserMapper;
import com.pojo.Users;
import com.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Users> Find(String name, Integer age) throws Exception {
        List<Users> list = userMapper.Find(name, age);
        for (Users us: list) {
            System.out.println(us.toString());
        }
        return list;
    }

    @Override
    public Integer add(Users us) {
        return userMapper.add(us);
    }

}
