package com.xiaohu.leetcode;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class ForTest {
    public static void main(String[] args) {
        int i = 0;
        for (getChar('A'); i < 2 && getChar('B'); getChar('C')) {
            i++;
            getChar('D');
        }
    }

    private static boolean getChar(char a) {
        System.out.print(a);
        return true;
    }
}
