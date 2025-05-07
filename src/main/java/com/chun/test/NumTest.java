package com.chun.test;

import java.util.*;

/**
 * @description:
 * @author: chun
 **/

public class NumTest {
    public static void main(String[] args) {
        int[] nums;
        nums = new int[]{1, -1, 0};
        subarraySum(nums,0);
        String ss = "123";
        int i = ss.hashCode();
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;

                }
            }
        }
        return count;
    }
}
