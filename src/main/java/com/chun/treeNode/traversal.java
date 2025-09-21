package com.chun.treeNode;

import javax.swing.tree.TreeNode;
import java.util.*;

/**
 * @description: 树相关
 * @author: chun
 **/

public class traversal {

    public static void main(String[] args) {

        int[] nums = {6,7,8,9,1,2,3,11};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums){
        int right = nums.length - 1;
        quickSort(nums,0,right);


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

        while(fast < right){
            if(nums[fast] < nums[pivot]){
                swap(nums,fast,slow);
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