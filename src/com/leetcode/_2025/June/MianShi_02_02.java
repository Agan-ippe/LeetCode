package com.leetcode._2025.June;

/**
 * @Author Aip
 * @Date 2025/06/25   11:51
 * @Version 1.0
 * @Description 面试题 02.02. 返回倒数第 k 个节点
 */
// 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
// 输入： 1->2->3->4->5 和 k = 2
// 输出： 4
public class MianShi_02_02 {
    public static void main(String[] args) {

    }

    /**
     * 方法一：单指针，算出全长，再算需要后移几位
     * @param head
     * @param k
     * @return
     */
    // 倒数第 n 个就是，从第一个元素开始，往后走 （全长-n）步
    // 例如下标全长是 7 ，倒数第 2 个就是 往后走 5 步
    // 1，2，3，4，5，6，7
    // 6
    public int methodOne(ListNode head, int k) {
         ListNode countLen = head;
         int len = 0;
         while(countLen != null) {
             countLen = countLen.next;
             len++;
         }
         ListNode temp = head;
         for(int i = 0; i < len - k; i++) {
             temp = temp.next;
         }
         return temp.val;

        // 方法2：快慢针
        // 倒数第 n 个就是，前一个指针比后一个指针先走 n 位
        // 例如 倒数第 3 个，前一个先走 3 位
        // ↓
        // ↓
        // 1,2,3,4,5,6,7
        // ↓ ↓
        // 1,2,3,4,5,6,7
        // ↓   ↓
        // 1,2,3,4,5,6,7
        //   ↓   ↓
        // 1,2,3,4,5,6,7
        //     ↓   ↓
        // 1,2,3,4,5,6,7
        //       ↓   ↓
        // 1,2,3,4,5,6,7
        //         ↓   ↓
        // 1,2,3,4,5,6,7
        int len = 0;
        ListNode cur = head, pre = head;
        while(len != k) {
            cur = cur.next;
            len++;
        }
        while(cur != null) {
            cur = cur.next;
            pre = pre.next;
        }
        return pre.val;
    }

    /**
     * 方法2：快慢针
     * @param head
     * @param k
     * @return
     * 倒数第 n 个就是，前一个指针比后一个指针先走 n 位
     * 例如 倒数第 3 个，前一个先走 3 位
     * ↓
     * ↓             -- ↓ ↓           -- ↓   ↓
     * 1,2,3,4,5,6,7 -- 1,2,3,4,5,6,7 -- 1,2,3,4,5,6,7
     *
     *   ↓   ↓       --     ↓   ↓     --       ↓   ↓
     * 1,2,3,4,5,6,7 -- 1,2,3,4,5,6,7 -- 1,2,3,4,5,6,7
     *         ↓   ↓
     * 1,2,3,4,5,6,7
     */
    public int methodTwo(ListNode head, int k) {
        int len = 0;
        ListNode cur = head, pre = head;
        while(len != k) {
            cur = cur.next;
            len++;
        }
        while(cur != null) {
            cur = cur.next;
            pre = pre.next;
        }
        return pre.val;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val;this.next = next;}
    }
}
