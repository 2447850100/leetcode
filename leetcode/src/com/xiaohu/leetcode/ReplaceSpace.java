package com.xiaohu.leetcode;

/**
 * @author 小胡哥哥
 * NO BB show your code
 * <p>
 * /请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * //
 * //
 * //
 * // 示例 1：
 * //
 * // 输入：s = "We are happy."
 * //输出："We%20are%20happy."
 * //
 */
public class ReplaceSpace {
    public static void main(String[] args) {
        String s = "   hello we";
        System.out.println(replaceSpace(s));
    }

    public static String replaceSpace(String s) {
        if ("".equals(s)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append("%20");
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
