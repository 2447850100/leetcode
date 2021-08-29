package com.xiaohu.leetcode;

import java.util.Arrays;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class ReverseString {
    public static void main(String[] args) {
        char[] s = {' '};
        int a = 1;
        int b = 2;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        //System.out.println(a);
        //System.out.println(b);
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        if (s.length == 0) {
            return;
        }
        if (s.length == 1) {
            System.out.println(s[0]);
            return;
        }

        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            s[i] = (char) (s[i] ^ s[j]);
            s[j] = (char) (s[i] ^ s[j]);
            s[i] = (char) (s[i] ^ s[j]);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(s));
    }
}
