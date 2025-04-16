package com.chun.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description:
 * @author: chun
 **/

public class NumTest {
    public static void main(String[] args) {
        int end = (int)1e7;
        System.out.println(toList(end));
    }

    public static List<Integer> toList(int a){
        List<Integer> list = new ArrayList<>();
        while(a > 0) {
            int b = a % 10;
            list.add(b);
            a/=10;
        }
        Collections.reverse(list);
        return list;
    }
}
