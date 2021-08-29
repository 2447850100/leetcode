package com.xiaohu.leetcode;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class MyAtoi {
    public static void main(String[] args) {
        String s = "     123-124";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int index = 0;
        //去掉前导空格
        while (index < n && chars[index] == ' ') {
            index++;
        }
        if (index == n) {
            return 0;
        }
        //标记是否为负数
        boolean isNegative = false;
        if (chars[index] == '-') {
            isNegative = true;
            index++;
        } else if (chars[index] == '+') {
            index++;
        } else if (!Character.isDigit(chars[index])) {
            //其他符号
            return 0;
        }
        int res = 0;
        while (index < n && Character.isDigit(chars[index])) {
            int digit = chars[index] - '0';
            if (res > (Integer.MAX_VALUE - digit) / 10) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            res = res * 10 + digit;
            index++;
        }
        return isNegative ? -res : res;
    }

}
