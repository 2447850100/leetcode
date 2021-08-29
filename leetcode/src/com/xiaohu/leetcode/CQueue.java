package com.xiaohu.leetcode;

import java.util.Stack;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */


//用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的
//功能。(若队列中没有元素，deleteHead 操作返回 -1 )
//
//
//
// 示例 1：
//
// 输入：
//["CQueue","appendTail","deleteHead","deleteHead"]
//[[],[3],[],[]]
//输出：[null,null,3,-1]
//
//
// 示例 2：
//
// 输入：
//["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
//[[],[],[5],[2],[],[]]
//输出：[null,-1,null,null,5,2]
//
public class CQueue {

    public static void main(String[] args) {
        CQueue c = new CQueue();

        c.deleteHead();
        c.appendTail(5);
        c.appendTail(2);

        int d1 = c.deleteHead();
        System.out.println(d1);
        int d2 = c.deleteHead();
        System.out.println(d2);

    }

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        //根据栈的先进后出，先将添加的值放在一个栈中
        stack1.push(value);

    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                Integer integer = stack1.pop();
                stack2.push(integer);
            }
        }
        return stack2.size() == 0 ? -1 : stack2.pop();
    }
}
