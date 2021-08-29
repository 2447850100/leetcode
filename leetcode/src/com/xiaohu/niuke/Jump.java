package com.xiaohu.niuke;

/**
 * @author 小胡哥哥
 * NO BB show your code
 * <p>
 * <p>
 * 给出一算组法正数题，你从第一个数向最后一个数方向跳跃， 每次至少跳跃1格， 每个数的值表示你
 * 从这个位置可以跳跃的最大长度。 计算如何以最少的跳跃次数跳到最后一个数。
 * 输入描述：
 * 第一行表示有多少个数n
 * 第二行开始依次是1到n个数， 一个数一行
 * 输出描述：
 * 输出一行， 表示最少跳跃的次数。
 * 输入
 * 7
 * 2 3 2 1 2 1 5
 * 输出
 * 3
 */
public class Jump {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 2, 1, 5};
        //int[] arr = {2,5,1,1,1,1};
        System.out.println(jump(arr));
    }

    private static int jump(int[] arr) {
       if (arr == null || arr.length ==0) {
          return 0;
       }
        int jump = 0, curr = 0, next = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > curr) {
                jump++;
                curr = next;
            }
            next = Math.max(next, i + arr[i]);

        }

        return jump;
    }
}
