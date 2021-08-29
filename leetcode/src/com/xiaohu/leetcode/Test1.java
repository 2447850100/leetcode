package com.xiaohu.leetcode;

import java.util.Scanner;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class Test1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {

         char[] chars = sc.nextLine().toCharArray();
         char[] flagArry = new char[52];
         for (char aChar : chars) {

            if (aChar >= 'a' && aChar <= 'z') {
               flagArry[(aChar - 'a' + 26)]++;
            }
            if (aChar >= 'A' && aChar <= 'Z') {
               flagArry[(aChar - 'A')]++;
            }
         }
         for (int i = 0; i < flagArry.length; i++) {

            if (flagArry[i] != 0) {

               for (int j = 0; j < flagArry[i]; j++) {
                  if (i > 25) {
                     System.out.print((char) (i + 'a' - 26));
                  } else {
                     System.out.print((char) (i + 'A'));
                  }

               }
               //System.out.println();
            }
         }

      }
   }
}
