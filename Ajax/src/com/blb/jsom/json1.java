package com.blb.jsom;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class json1 {
    public static void main(String[] args) throws IOException {
        person p=new person();
        p.setName("张三");
        p.setAge(35);
        p.setWork("项目经理");
        p.setBirthday(new Date());
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(p);
        System.out.println(s);
        mapper.writeValue(new BufferedWriter(new FileWriter("lib/a.txt")),p);
        person person = mapper.readValue(s, person.class);
        System.out.println(person);
    }
}
