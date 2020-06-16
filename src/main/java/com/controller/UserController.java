package com.controller;

import com.pojo.Users;
import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    private UserService demoService;


    @RequestMapping("find")
    public ModelAndView Find(String name,Integer age) throws Exception {
        System.out.println(name);
        System.out.println(age);
        List<Users> list = demoService.Find(name, age);
        for (Users ef: list) {
            System.out.println(ef.toString());
        }
        ModelAndView mv=new ModelAndView();
        mv.addObject("mylist",list);
        mv.setViewName("find");
        return mv;
    }

    @RequestMapping("add")
    public ModelAndView add(Users us) throws Exception {
        Integer add = demoService.add(us);
        if(add>0){
            System.out.println(add.toString());
        }
        ModelAndView mv=new ModelAndView();
        mv.setViewName("add");
        return mv;
    }


}
