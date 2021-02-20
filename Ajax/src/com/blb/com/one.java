package com.blb.com;

import org.codehaus.jackson.map.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

@WebServlet("/demo1")
public class one extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
//        String age = req.getParameter("age");
        System.out.println(username);
//        System.out.println(age);
//        System.out.println("开始执行write函数");
//        resp.getWriter().write("username:"+username);
             User user=new User();
             user.setUsername(username);
        ObjectMapper mapper=new ObjectMapper();
       String s= mapper.writeValueAsString(user);
       resp.getWriter().write(s);
    }
}
