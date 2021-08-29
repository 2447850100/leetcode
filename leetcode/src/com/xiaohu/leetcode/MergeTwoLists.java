package com.xiaohu.leetcode;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class MergeTwoLists {
    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode res = null;
        ListNode n1 = l1;
        ListNode n2 = l2;

        while (n1.next!=null || n2.next!=null) {
            if (n1.val<= n2.val) {
                res = n1;
                res.next = n1.next;
            }else {
                res = n2;
                res.next = n2.next;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return res;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode res = null;
        if (l1.val > l2.val) {
            res = l2;
            res.next = mergeTwoLists(l1, l2.next);
        } else {
            res = l1;
            res.next = mergeTwoLists(l1.next, l2);
        }
        return  res;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
