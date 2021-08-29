package com.xiaohu.leetcode;

/**
 * @author 小胡哥哥
 * NO BB show your code adsadsa
 */
public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] temp = new int[n + 1];
        temp[1] = 1;
        temp[2] = 2;
        for (int i = 3; i <= n; i++) {
            temp[i] = temp[i - 1] + temp[i - 2];
        }
        return temp[n];
    }
}
