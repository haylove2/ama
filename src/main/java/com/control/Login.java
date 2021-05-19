package com.control;

import com.alibaba.fastjson.JSONObject;
import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author JAVA第二阶段 JavaWeb
 * @create 2021-05-17 9:28 星期一
 */
@Controller
public class Login {
    @RequestMapping("lg")
    @ResponseBody
    public String login(User u){
        System.out.println("调用登入方法");
        System.out.println("control->>>>>login"+u);
        JSONObject js = new JSONObject();
        js.put("k1","v1");
        js.put("k2","v2");
        return js.toJSONString();
    }
}
