package com.leetcode._2024.Mar._2nd_week;

/**
 * @author Aip
 * @version 1.0
 * @date 2024/3/6  15:08
 * @description 旋转数组： 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 *    新的数组下标： (i + k) % len
 *    i: 目标元素数组下标
 *    len: 数组长度
 */
public class Eq189 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        int len = nums.length;
        int[] numArr = new int[len];
        for (int i = 0; i < len; ++i) {
            numArr[(i + k) % len] = nums[i];
        }
        for (int i :numArr) {
            System.out.print(i);
            System.out.print(',');
        }
    }
}
