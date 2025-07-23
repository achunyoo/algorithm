package com.chun.sort;

import java.util.Arrays;

/**
 * @description:
 * @author: chun
 **/

public class test {
    public static void main(String[] args) {
        int[] test = new int[]{2,5,6,7,1,4,9,3};

        sort(test);
        System.out.print(Arrays.toString( test));
    }

    public static void sort(int[] nums){
        int right = nums.length - 1;
        int left = 0;
        quickSort(nums,left,right);
    }

    public static void quickSort(int[] nums,int left,int right){
        if(left >= right){
            return;
        }

        int mid = partition(nums,left,right);

        quickSort(nums,mid + 1,right);
        quickSort(nums,left,mid - 1);
    }

    public static int partition(int[] nums,int left,int right){
        int pivot = right;
        int fast = left;
        int slow = left;

        while(fast != right){
            if(nums[fast] < nums[pivot]){
                swap(nums,slow,fast);
                slow++;
            }
            fast++;
        }

        swap(nums,slow,pivot);

        return slow;
    }

    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
