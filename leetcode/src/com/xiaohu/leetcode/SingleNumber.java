package com.xiaohu.leetcode;

import java.util.HashMap;

import java.util.Set;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 2, 2};
        System.out.println(sing(nums));

    }

   /**
    * 采用XOR异或运算
    * @param nums
    * @return
    */
    public static int sing(int[] nums) {
       for (int i = 1; i < nums.length; i++) {
          nums[0] ^= nums[i];
       }
       return nums[0];
    }

    /**
     * 找出数组只出现一次的元素
     *
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

       for (int num : nums) {

          if (map.containsKey(num)) {
             map.put(num, map.get(num) + 1);
          } else {

             map.put(num, 1);
          }
       }
       Set<Integer> keySet = map.keySet();
       for (Integer key : keySet) {
          Integer value = map.get(key);
          if (value == 1) {
             return key;
          }
       }
       return -1;


//        int count = 1;
//        while (k1 <= k2) {
//            if (nums[k1] == nums[k2]) {
//                if (map.containsKey(nums[k1])) {
//                    count = map.get(nums[k1]);
//                    count++;
//                    map.put(nums[k1], count);
//                } else {
//                    if (k1 == k2) {
//                        map.put(nums[k1], 1);
//                    } else {
//                        map.put(nums[k1], 2);
//                    }
//
//                }
//                k2--;
//            } else {
//                if (map.containsKey(nums[k1]) || map.containsKey(nums[k2])) {
//                    if (map.get(nums[k1]) != null || map.get(nums[k2]) != null) {
//                        int count1 = map.get(nums[k1]);
//                        int count2 = map.get(nums[k2]);
//                        if (count1 >= 1) {
//                            count1++;
//                        }
//                        if (count2 >= 1) {
//                            count2++;
//                        }
//                        map.put(nums[k1], count1);
//                        map.put(nums[k2], count2);
//                        k2--;
//
//                    }
//
//
//                } else {
//                    count = 1;
//                    map.put(nums[k1], 1);
//                    map.put(nums[k2], 1);
//                    k2--;
//                }
//
//            }
//            k1++;
//        }
//        Set<Integer> keySet = map.keySet();
//        for (Integer key : keySet) {
//            Integer countVal = map.get(key);
//            if (countVal == 1) {
//                return key;
//            }
//        }
//        return -1;
    }
}
