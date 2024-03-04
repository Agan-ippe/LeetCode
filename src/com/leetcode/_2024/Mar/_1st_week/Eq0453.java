package com.leetcode._2024.Mar._1st_week;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Aip
 * @version 1.0
 * @date 2024/3/2  13:23
 * @description 题目编号453. 最小移动次数使数组元素相等     给你一个长度为 n 的整数数组，每次操作将会使 n - 1 个元素增加 1 。返回让数组所有元素相等的最小操作次数。
 */
public class Eq0453 {
    public static void main(String[] args) {
        int[] arr = {4,3,4};
        int min = arr[0];
        int sum = 0;
        //遍历数组，得到最小元素
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        //遍历每个元素与最小元素的差，求所以差的和
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] - min;
        }
        System.out.println(sum);
    }
}
