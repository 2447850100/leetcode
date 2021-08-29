package com.xiaohu.leetcode;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class FIB {
    public static void main(String[] args) {
        FIB test = new FIB();
        System.out.println(test.fib(2));
        //System.out.println(Integer.MAX_VALUE);
    }

    public int fib(int n) {
        if (n <= 2) {
            return n == 0 ? 0 : 1;
        }
//        int[] num = {0, 1};
//        if (n < 2) {
//            return num[n];
//        }
        // int res = 0;
        int num1 = 0;
        int num2 = 1;
        int res = 0;
        for (int i = 2; i <= n; i++) {
            //return  fib(n -1) + fib(n -2);
            res = (num1 + num2) % 1000000007;
            num1 = num2;
            num2 = res;
        }
        return res;
    }
}
