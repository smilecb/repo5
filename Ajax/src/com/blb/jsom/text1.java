package com.blb.jsom;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class text1 {
    public static void main(String[] args) throws IOException {
        person p=new person();
        p.setName("张三");
        p.setAge(22);
        p.setWork("程序员");
        //创建json核心对象ObjectMapper
        ObjectMapper mapper=new ObjectMapper();
        /*
           转换方法
           writeValue(参数1，obj)
           参数1
              File 将OBJ对象转换为json字符串 并保存到指定文件中
              writer  将OBJ对象转换为json字符串 并将json数据填充到字符输出流中
              OutputStream 将OBJ对象转换为json字符串 并将json数据填充到字节输出流中
           writeValueAsString(obj):将对象转为json字符串
         */
        String json=mapper.writeValueAsString(p);
        System.out.println(json);
        Writer writer=new FileWriter("lib/a.txt");
        mapper.writeValue(writer,p);

    }
}
