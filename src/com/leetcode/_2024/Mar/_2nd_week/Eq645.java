package com.leetcode._2024.Mar._2nd_week;

/**
 * @author Aip
 * @version 1.0
 * @date 2024/3/10  22:32
 * @description 错误的集合
 */
public class Eq645 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,4,6,7};
        int n = nums.length;
        int[] cnt = new int[n + 1];
        for (int x : nums){
            cnt[x]++;
        }
        int[] ans = new int[2];
        for (int i = 1; i <= n; i++) {
            if (cnt[i] == 0){
                ans[1] = i;
            }
            if (cnt[i] == 2){
                ans[0] = i;
            }
        }
        for (int i :ans) {
            System.out.print(i + " ");
        }
    }
}
