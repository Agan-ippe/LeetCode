package com.leetcode._2024.Mar._2nd_week;


/**
 * @author Aip
 * @version 1.0
 * @date 2024/3/4  9:08
 * @description 非递减数列  注意是非递减即可，可以有等于前一个元素的。
 */
public class Eq665 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 3};
//        int[] nums1 = {1, 1, 1};
        System.out.println(checkPossibility(nums));
    }

    public static boolean checkPossibility(int[] nums) {
        //思路，排序，当排序到第一个非递减元素，次数加一，遇到第二个此类元素，退出排序，直接False
        //修正，不应该叫排序，其实想表达遍历
        int len = nums.length;
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            int x = nums[i];
            int y = nums[i + 1];
            if (x > y) {
                count++;
                if (count > 1) {
                    return false;
                }
                //如果遇到非递减元素，则将y与x前一位对比
                if (i > 0 && y < nums[i - 1]) {
                    nums[i + 1] = x;
                }
            }
        }
        return true;
    }
}
