package com.leetcode._2024.Mar._2nd_week;

/**
 * @author Aip
 * @version 1.0
 * @date 2024/3/5  21:20
 * @description 题目283 移动零
 */
public class Eq283 {
    public static void main(String[] args) {
        int[] ints = new int[]{1,4,0,2,0,5};
        moveZeroes(ints);
    }
    public static void moveZeroes(int[] nums) {
        //双指针 a b
        //指针a 遇到一个非零的元素，将指针b往后移一位，直到遇到零，将两指针替换。
        //            a
        //  1 1 4 0 0 3
        //        b
        //指针a,b 临时变量tmp
        int b =0;
        int tmp =0;
        int len = nums.length;
        for(int a = 0; a<len; a++){
            //如果是非零元素，则将指针往后移
            if(nums[a] != 0){
                tmp = nums[a];
                nums[a] = nums[b];
                nums[b++] = tmp;
            }
        }
        for (Integer i :nums) {
            System.out.print(i);
            System.out.print(',');
        }

    }
}
