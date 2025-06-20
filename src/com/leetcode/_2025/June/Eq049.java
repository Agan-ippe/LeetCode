package com.leetcode._2025.June;


import java.util.*;

/**
 * @Author Aip
 * @Date 2025/06/20   21:53
 * @Version 1.0
 * @Description 题目49：字母异位词分组
 */
// 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
// 字母异位词：字母异位词是通过重新排列不同单词或短语的字母而形成的单词或短语，
// 并使用所有原字母一次。
public class Eq049 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        // 解题思路
        // 1、遍历字符串
        // 2、通过给字符排序
        // 3、筛选由相同字符组成的单词
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(String string : strs){
            char[] chars = string.toCharArray();
            // 给字符数组排序，并按照顺序返回
            Arrays.sort(chars);
            String key = new String(chars);
            // getOrDefault() 如果有这个key就返回这个key，没有就返回后面那个参数
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(string);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}

