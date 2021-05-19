package com.pojo;

import org.springframework.stereotype.Component;

/**
 * @author JAVA第二阶段 JavaWeb
 * @create 2021-05-17 9:29 星期一
 */
@Component
public class User {
    private String name;
    private String pass;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
