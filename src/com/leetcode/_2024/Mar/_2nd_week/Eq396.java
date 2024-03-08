package com.leetcode._2024.Mar._2nd_week;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Aip
 * @version 1.0
 * @date 2024/3/8  17:11
 * @description 旋转数组
 * 解题公式：F(i) = F(i-1) + 数组中元素和 - 数组长度 * nums[数组长度 - i]
 */
public class Eq396 {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 6};
        //数组长度
        int len = nums.length;
        //数组元素和
        int numSum = 0;
        //用于存放函数值的临时变量
        int tmp = 0;
        //函数值
        int res = 0;

        //计算元素和
        for (int i = 0; i < len; i++) {
            numSum += nums[i];
        }

        //计算F(0)
        for (int i = 0; i < len; i++) {
            res += i * nums[i];
        }
        tmp = res;
        //迭代计算
        for (int i = 1; i < len; i++) {
            res = res + numSum - len * nums[len - i];
            tmp = res > tmp ? res : tmp;
        }
        System.out.println(tmp);
    }
}
