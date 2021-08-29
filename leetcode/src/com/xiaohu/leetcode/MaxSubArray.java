package com.xiaohu.leetcode;

import java.util.Arrays;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class MaxSubArray {
   public static int maxSubArray(int[] nums) {
      if (nums.length == 1) {
         return nums[0];
      }
      int res = 0;
      int sum = 0;
      for (int num : nums) {
         if (sum>0) {
            sum += num;
         }else {
            sum = num;
         }
         res = Math.max(res,sum);
      }
      return res;
   }
   public static int max(int[] nums) {
      if (nums.length == 1) {
         return nums[0];
      }
      for (int i = 1; i <nums.length; i++) {
         if (nums[i -1] >0) {
            nums[i] += nums[i-1];
         }
      }

      return Arrays.stream(nums).max().getAsInt();
   }
   public static void main(String[] args) {
      int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
      long start = System.currentTimeMillis();
      System.out.println(maxSubArray(nums));
      long end = System.currentTimeMillis();
      System.out.println("时间"+ (end-start));
      long start1 = System.currentTimeMillis();
      System.out.println(max(nums));
      long end1 = System.currentTimeMillis();
      System.out.println("时间"+ (end1-start1));
      System.out.println(Runtime.getRuntime().availableProcessors());
   }
}
