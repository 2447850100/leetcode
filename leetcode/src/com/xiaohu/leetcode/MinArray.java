package com.xiaohu.leetcode;

/**
 * @author 小胡哥哥
 * NO BB show your code
 * <p>
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2
 * //] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。
 */
public class MinArray {
    public static void main(String[] args) {
        int[] numbers = {2, 2, 2, 0, 1};

        //System.out.println(Arrays.stream(numbers).reduce(0,BigDecimal::subtract).);
        System.out.println(minArray(numbers));
    }

    public static int minArray(int[] numbers) {
        int k1 = 0;
        int k2 = numbers.length - 1;
        if (k2 == 0) {
            return numbers[0];
        }
        while (k1 < k2) {
            int mid = k1 + (k2 - k1) /2;
            if (numbers[mid] < numbers[k2]) {
                k2 = mid;
            } else if (numbers[mid] > numbers[k2]) {
                k1 = mid + 1;
            } else if (numbers[mid] == numbers[k2]) {
                    k2--;
            }
        }
        return numbers[k1];
//        int low = 0;
//        //int k2 = numbers.length - 1;
//        int high = numbers.length - 1;
//        if ( high== 0) {
//            return numbers[0];
//        }
//
//        while (low < high) {
//            int pivot = low + (high - low) >> 1;
//            if (numbers[pivot] < numbers[high]) {
//                high = pivot;
//            } else if (numbers[pivot] > numbers[high]) {
//                low = pivot + 1;
//            } else {
//                high -= 1;
//            }
//        }
//        return numbers[low];
//
//
    }
}
