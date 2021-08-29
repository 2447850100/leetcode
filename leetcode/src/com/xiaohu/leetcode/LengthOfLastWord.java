package com.xiaohu.leetcode;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class LengthOfLastWord {
   public static void main(String[] args) {
      String s = "hello";
      System.out.println(lengthOfLastWord(s));
   }
   private static int  lengthOfLastWord(String str) {
      if (str.length() == 0) {
         return 0;
      }
      String[] strings = str.split(" ");
      int length = 0;

      for (int i = strings.length - 1; i >= 0; i--) {
         length = strings[i].length();
         break;
      }
      return length;
   }

   private static int extracted(String str) {
      String[] strings = str.split(" ");

      for (int i = strings.length - 1; i >= 0; i--) {
         return strings[i].length();
      }
      return 0;
   }
}
