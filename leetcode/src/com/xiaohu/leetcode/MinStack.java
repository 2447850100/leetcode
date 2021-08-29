package com.xiaohu.leetcode;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */

/**
 * 使用链表解法
 */

   class MinStack {
      ListNode head;
      /** initialize your data structure here. */
      public MinStack() {

      }

      public void push(int val) {
         if (head == null) {
            head = new ListNode(val,val);
         }else {
            head = new ListNode(val,Math.min(head.min,val),head);

         }
      }

      public void pop() {
         head = head.next;
      }

      public int top() {
         return head.val;
      }

      public int getMin() {
         return head.min;
      }

    private  class ListNode {
        int val, min;
        ListNode next;

        public ListNode(int val, int min) {
            this.val = val;
            this.min = min;
        }

        public ListNode(int val, int min, ListNode next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
   }

