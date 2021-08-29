package com.xiaohu.leetcode;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class ReverseWords {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        if (s.length() == 0) {
            return null;
        }
        if (s.length() == 1) {
            return s;
        }
        String[] strings = s.split(" ");
        int k1;
        int k2;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            k1 = 0;
            k2 = strings[i].length() - 1;
            char[] chars = strings[i].toCharArray();
            while (k1 < k2) {
                chars[k1] = (char) (chars[k1] ^ chars[k2]);
                chars[k2] = (char) (chars[k1] ^ chars[k2]);
                chars[k1] = (char) (chars[k1] ^ chars[k2]);
                k1++;
                k2--;
            }

            if (i == strings.length - 1) {
                sb.append(chars);
            } else {
                sb.append(chars).append(" ");
            }
        }
        return sb.toString();
    }
}
