package com.xiaohu.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class ValidateStackSequences {
    public static void main(String[] args) {

    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> deque = new ArrayDeque<>();
        int index = 0;
        for (int res : pushed) {
            deque.push(res);
            while (index < popped.length && !deque.isEmpty() && deque.peek() == popped[index]) {
                index++;
                deque.pop();
            }
        }
        return index == popped.length;
    }
}
