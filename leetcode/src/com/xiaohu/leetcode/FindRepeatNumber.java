package com.xiaohu.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 小胡哥哥
 * NO BB show your code
 * <p>
 * <p>
 * //在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请
 * //找出数组中任意一个重复的数字。
 */
public class FindRepeatNumber {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));
    }

    public static int findRepeatNumber1(int[] nums) {
        int k1 = 0;
        int k2 = 1;
        while (k2 < nums.length) {
            if (nums[k1] == nums[k2]) {
                return nums[k1];
            }
            k1++;
            k2++;
        }
        return -1;
    }


    public static int findRepeatNumber(int[] nums) {

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                return num;
            }
            hashMap.put(num, 1);
        }
        return -1;
    }
}
