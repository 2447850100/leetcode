package com.xiaohu.leetcode;

import java.awt.*;
import java.util.List;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class DeleteNode {
   static ListNode head = new ListNode(0);
   public static void main(String[] args) {
      ListNode nod1 = new ListNode(4);
      //nod1.next = head.next;
      nod1 = head.next;
      ListNode node2 = new ListNode(5);
      //node2.next = nod1.next;
      node2 = nod1.next;
      ListNode node3 = new ListNode(1);
      //node3.next = node2.next;
      node3 = node2.next;
      ListNode node4 = new ListNode(9);
     // node4.next = node3.next;
      node4 = node3.next;
      DeleteNode d = new DeleteNode();
      System.out.println("head = " + head);
      d.deleteNode(head);
      System.out.println("head = " + head);
   }


   public void deleteNode(ListNode node) {

     node.val = node.next.val;
     node.next = node.next.next;
   }
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

       @Override
       public String toString() {
          return "ListNode{" +
                  "val=" + val +
                  '}';
       }
    }
}
