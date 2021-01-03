package com.chenkai;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloGit {
    public static void main(String[] args) throws ParseException {
        //字符串转int
        int a=Integer.parseInt("100");
        System.out.println(a);
        //int转字符串
        int b=100;
        String c=b+"";
        System.out.println(c);
        //int转Integer 装箱
        Integer d=100;
        System.out.println(d);
        //Integer转int 拆箱
        int e=d;
        System.out.println(e);
        //integer转字符串
        String f=String.valueOf(d);
        System.out.println(f);
        //字符串转Integer
        Integer g=Integer.valueOf("200");
        System.out.println(g);
        //date类型转字符串类型时间格式
        Date nowTime=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        System.out.println(sdf.format(nowTime));
        //string类型转date类型
        String passTime="2011-11-11 11:11:11";
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time=sdf2.parse(passTime);
        System.out.println(time);



    }
}
