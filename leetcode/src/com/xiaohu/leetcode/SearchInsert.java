package com.xiaohu.leetcode;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class SearchInsert {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 7};
        SearchInsert searchInsert = new SearchInsert();
        System.out.println(searchInsert.searchInsert(array, 2));
    }

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid ;
        //二分查找
        while (low <= high) {
             mid = (high + low) >> 1;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                //找到目标值
                return mid;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                //target>一个数&& <后一个数
                if (target > nums[i] && target < nums[i + 1]) {
                    //该位置+1就是target的位置
                    return i + 1;
                }
            }
            if (i == nums.length - 1 && nums[i] < target) {
                //target的数比数组所有值都大，放最后
                return nums.length;
            }
        }
        //target比所有的值都小，放0索引位置
        return 0;
    }
}
