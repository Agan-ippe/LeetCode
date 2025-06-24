package com.leetcode._2025.June;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Aip
 * @Date 2025/06/24   22:10
 * @Version 1.0
 * @Description 面试题 02.01. 移除重复节点
 */
// 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
// 提示：
// 链表长度在[0, 20000]范围内。
// 链表元素在[0, 20000]范围内。
public class MianShi_02_01 {
    // 剔除重复元素，使用Set集合
    public static ListNode removeDuplicateNodes(ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        ListNode cur = head;
        while (cur != null && cur.next != null){
            set.add(cur.val);
            // 如果包含就指向下一个节点
            if(set.contains(cur.next.val)){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
