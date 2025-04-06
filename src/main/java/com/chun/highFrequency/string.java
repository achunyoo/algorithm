package com.chun.highFrequency;

/**
 * @description: 字符串处理
 * @author: chun
 **/

public class string {
    public static void main(String[] args)
    {
        String str = "abcdefg";
        System.out.println("字符串长度" + str.length());
        System.out.println("字符串首字母" + str.charAt(0));
        System.out.println("子字符串" + str.substring(2, 4));

        //StringBuilder工具类
        StringBuilder sb = new StringBuilder("hello");
        sb.append("world");
        System.out.println(sb);
        sb.insert(5, " ");
        sb.insert(6, "java");
        System.out.println(sb);
        sb.delete(5, 6);
        System.out.println(sb);
        //反转
        sb.reverse();
        System.out.println(sb);

        //字符串转为字符数组
        char[] chars = str.toCharArray();
    }
}
