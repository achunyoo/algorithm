package com.chun.sort;

import java.util.Arrays;

/**
 * @description: 快速排序
 * @author: chun
 **/

public class quickSort {
    public static void main(String[] args) {
        int[] test = new int[]{2,5,6,7,1,4,9,3};

        sort(test);
        System.out.println(Arrays.toString(test));
    }

    public static void sort(int[] nums){
        int right = nums.length - 1;
        quickSort(0,right,nums);
    }

    public static void quickSort(int left,int right,int[] nums){
        if(left >= right){
            return;
        }

        int mid = partition(nums,left,right);

        quickSort(mid + 1,right,nums);
        quickSort(left,mid - 1,nums);
    }

    public static int partition(int[] nums,int left,int right){
        int fast = left;
        int slow = left;

        int pivot = nums[right];

        while(fast < right){
            if(nums[fast] < pivot){
                swap(slow,fast,nums);
                slow++;
            }
            fast++;
        }

        swap(slow,right,nums);
        return slow;
    }

    public static void swap(int slow,int fast,int[] nums){
        int temp = nums[slow];
        nums[slow] = nums[fast];
        nums[fast] = temp;
    }
}
