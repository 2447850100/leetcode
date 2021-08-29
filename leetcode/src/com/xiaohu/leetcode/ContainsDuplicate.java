package com.xiaohu.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        //int[] nums = {1,0,1,3,3,4,3,2,4,2};
        int[] nums = {1, 2, 2, -4, 0};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
//        if (nums.length < 2) {
//            return false;
//        }
//       Map<Integer, Integer> hash = new HashMap<>();
//        for (int num : nums) {
//            if (hash.containsKey(num)) {
//                return true;
//            } else {
//                hash.put(num, 1);
//            }
//        }
//        return false;
    }
}
