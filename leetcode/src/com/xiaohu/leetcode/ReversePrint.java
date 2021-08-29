package com.xiaohu.leetcode;

import java.util.Stack;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class ReversePrint {
    public int[] reversePrint(DeleteNode.ListNode head) {
        if (head == null) {
            return new int[0];
        }
        Stack<Integer> stack = new Stack<>();
        DeleteNode.ListNode curr = head;
        while (curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }
        int[] res = new int[stack.size()];
        int index = 0;
        while (!stack.isEmpty()) {
            res[index] = stack.pop();
            index++;
        }
        return res;
    }
}
