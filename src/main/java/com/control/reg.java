package com.control;

import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author JAVA第二阶段 JavaWeb
 * @create 2021-05-17 11:00 星期一
 */
@Controller
@RequestMapping("reg")
public class reg {
//    @Resource
    @Autowired
    User u;
    @RequestMapping(value = "lg",method = RequestMethod.POST)
    @ResponseBody
    public String login(String name,String pass,User u){
        System.out.println("reg->>>lg:name:" + name + "---pass:" + pass);
        System.out.println(u);
        return "1";
    }
}
