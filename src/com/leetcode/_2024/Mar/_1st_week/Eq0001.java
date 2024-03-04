package com.leetcode._2024.Mar._1st_week;

import java.util.Arrays;

/**
 * @author Aip
 * @version 1.0
 * @date 2024/3/1  16:02
 * @description 两数之和,这里用到的方法是暴力枚举，直接使用两个for来遍历。这样做的时间复杂度较大。优化方式：可以使用哈希表。目前并没有领略到精髓
 */
public class Eq0001 {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums,9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] +nums[j]){
                    int[] count={i,j};
                    return count;
                }
            }
        }
        return null;
    }

}
