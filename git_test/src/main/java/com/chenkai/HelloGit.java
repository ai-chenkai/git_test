package com.chenkai;

public class HelloGit {
    public static void main(String[] args) {
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

    }
}
