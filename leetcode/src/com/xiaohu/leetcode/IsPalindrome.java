package com.xiaohu.leetcode;

import java.util.Objects;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class IsPalindrome {
    public static void main(String[] args) {
        //String s = "A man, a plan, a canal: Panama";
        String s = "a.a";

        System.out.println(isPalindrome(s));
    }

    /**
     * 验证回文串
     *
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        if (Objects.isNull(s) || s.length() == 1) {
            return true;
        }
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || (!(String.valueOf(s.charAt(i))).matches("^[A-Za-z0-9]+$"))) {
                continue;
            }
            sb.append(s.charAt(i));
        }
        s = sb.toString();
        // 1.return sb.toString().equals(sb.reverse().toString());

        int key = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {

//            }
            //if (s.matches("^[A-Za-z0-9]+$")) {
            if (i <= key) {
                if (s.charAt(i) == s.charAt(key)) {
                    key--;
                } else {
                    return false;
                }
                // }
            }
        }
        return true;
    }
}
