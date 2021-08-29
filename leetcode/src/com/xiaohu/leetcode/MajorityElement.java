package com.xiaohu.leetcode;


/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int count = 1;
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (res == nums[i]) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    res = nums[i + 1];
                }
            }
        }
        return res;
    }

//    public static int majorityElement(int[] nums) {
//
//        if (nums.length == 0) {
//            return 0;
//        }
//        Map<Integer, Integer> hashMap = new HashMap<>();
//        for (int num : nums) {
//            if (hashMap.containsKey(num)) {
//                hashMap.put(num, hashMap.get(num) + 1);
//            } else {
//                hashMap.put(num, 1);
//            }
//        }
//        int result = 0;
//        Set<Integer> keySet = hashMap.keySet();
//        for (Integer key : keySet) {
//            Integer value = hashMap.get(key);
//            result = Math.max(result, value);
//        }
//        for (Integer integer : keySet) {
//            if (result == hashMap.get(integer)) {
//                return integer;
//            }
//        }
//        return -1;
//    }
}
