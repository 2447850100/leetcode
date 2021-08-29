package com.xiaohu.leetcode;

import java.util.Arrays;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class Merge {
   public static void main(String[] args) {
      int[] nums1 = {1, 2, 3, 0, 0, 0};
      int[] nums2 = {2, 5, 6};
      merge1(nums1, 3, nums2, 3);
      Arrays.stream(nums1).forEach(System.out::print);
      System.out.println();
      System.out.println("length = " + nums1.length);

   }

   public static void merge1(int[] nums1, int m, int[] nums2, int n) {
      int key = m-- + --n;

      while (n >= 0) {
         nums1[key--] = m >= 0 && nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
      }
   }

   public static void merge2(int[] nums1, int m, int[] nums2, int n) {

     System.arraycopy(nums2,0,nums1,m,n);
     Arrays.sort(nums1);
   }
}