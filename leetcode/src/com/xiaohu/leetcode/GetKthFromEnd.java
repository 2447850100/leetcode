package com.xiaohu.leetcode;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class GetKthFromEnd {
    public DeleteNode.ListNode getKthFromEnd(DeleteNode.ListNode head, int k) {
        DeleteNode.ListNode k1 = head;
        DeleteNode.ListNode k2 = head;
        while (k > 0 && k1 != null) {
            k1 = k1.next;
            k--;
        }
        while (k1 != null) {
            k1 = k1.next;
            k2 = k2.next;
        }
        return k2;
    }
}
