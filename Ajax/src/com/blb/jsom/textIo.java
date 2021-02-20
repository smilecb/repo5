package com.blb.jsom;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class textIo {
    public static void main(String[] args) throws IOException {
        //1.创建写对象
//        Write write=new Write();
        //2.写的几种方式
        /*
        Write类中的方法
        1.write(int ch)  一次写入一个字符
        2.write(char cd[],index len) 一次写入一个字符数组
        write(String s) 一次写入一个字符串
         */
       Writer write=new FileWriter("lib/a.txt");
       write.write("123");
      write.close();

    }
}
