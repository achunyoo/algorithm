package com.chun.highFrequency;

/**
 * @description: 数学类工具
 * @author: chun
 **/


public class math {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("找出两者的最大值" + Math.max(a, b));
        System.out.println("找出两者的最小值" + Math.min(a, b));
        System.out.println("求两者的绝对值" + Math.abs(a - b));
        System.out.println("求a的平方根" + Math.sqrt(a));

        System.out.println("求a的b次幂" + Math.pow(a, b));


    }

}
