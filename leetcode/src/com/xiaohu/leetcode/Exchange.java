package com.xiaohu.leetcode;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class Exchange {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(exchange1(nums)));
    }

    public static int[] exchange1(int[] nums) {
        if (nums.length == 0) {
            return new int[0];
        }
        int k1 = 0;
        int k2 = nums.length - 1;
        while (k1 < k2) {
            while (k1 < k2 && nums[k1] % 2 != 0) {
                k1++;
            }
            while (k1 < k2 && nums[k2] % 2 == 0) {
                k2--;
            }
            if (k1 < k2) {
                nums[k1] = nums[k1] ^ nums[k2];
                nums[k2] = nums[k1] ^ nums[k2];
                nums[k1] = nums[k1] ^ nums[k2];
            }
        }
        return nums;
    }

    public static int[] exchange(int[] nums) {
        if (nums.length == 0) {
            return new int[0];
        }
        List<Integer> numsList = new ArrayList<Integer>();

        Stack<Integer> list = new Stack<>();
        for (int num : nums) {
            list.push(num);
        }
        int index = 0;
        while (!list.isEmpty()) {
            Integer num = list.pop();
            if (num % 2 == 0) {
                numsList.add(num);
            } else {
                nums[index] = num;
                index++;
            }
        }

        for (Integer integer : numsList) {
            nums[index] = integer;
            index++;
        }
        return nums;
    }
}
