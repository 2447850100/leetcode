package com.xiaohu.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class ReverseList {
    public static void main(String[] args) {
        ListNode root = new ListNode();

        ListNode head = root;
        head.val = 1;
        ListNode node1 = head.next;
        node1.val = 2;
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        ListNode node3 = new ListNode(4);
        node2.next = node3;
        ListNode node4 = new ListNode(5);
        node3.next = node4;
        System.out.println("head = " + root);
        System.out.println(reverseList(root));
    }

   public static ListNode reverseList(ListNode head) {
      if (Objects.isNull(head)) {
         return null;
      }
      ListNode pre = null;
      ListNode temp = head;
      while (temp!=null) {
         ListNode next = temp.next;
         temp.next = pre;
        pre = temp;
        temp = next;
      }
      return pre;

   }
//    public static ListNode reverseList(ListNode head) {
//        if (Objects.isNull(head)) {
//            return null;
//        }
//        Stack<ListNode> nodeStack = new Stack<>();
//
//
//        while (head.next != null) {
//            nodeStack.push(head);
//            head = head.next;
//        }
//         ListNode root = new ListNode();
//         ListNode curr = root;
//        while (nodeStack.size() > 0) {
//            ListNode node = nodeStack.pop();
//            if (node != null) {
//                curr.next = node;
//                curr = curr.next;
//
//            }
//        }
//        curr.next = null;
//        return root;
//    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    '}';
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
