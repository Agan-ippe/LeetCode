package com.leetcode._2025.June;

/**
 * @Author Aip
 * @Date 2025/06/22   21:46
 * @Version 1.0
 * @Description 面试题 01.09. 字符串轮转
 */

// 给定两个字符串s1和s2，
// 请编写代码检查s2是否为s1旋转而成
// （比如，waterbottle是erbottlewat旋转后的字符串）。
// 提示：你能只调用一次检查子串的方法吗？
public class MianShi_01_09 {
    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        System.out.println(methodTwo(str1,str2));
    }
    // 解题思路：使用 String API
    // 1、判断两个字符串是否等长。
    // 2、目标字符串是给定字符串从某个位置截取，然后翻转拼接而成，应是连续的。
    // 所以直接从两个给定字符串拼接后得到的新串，去匹配是否包含目标串即可
    public static boolean methodTwo(String s1, String s2) {
///        boolean b = s1.length() == s2.length();
///        String temp = s1 + s1;
///        boolean b1 = temp.contains(s2);
///        return b && b1;
        return (s1.length() == s2.length()) && ((s1 + s1).contains(s2));
    }
}
