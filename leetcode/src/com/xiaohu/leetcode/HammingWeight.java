package com.xiaohu.leetcode;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class HammingWeight {
    public static void main(String[] args) {
        Integer n  =  294967293;
        System.out.println(n);
    }
    public static int hammingWeight(int n) {
    return Integer.bitCount(n);
    }
}
