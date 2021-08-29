package com.xiaohu.leetcode;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class ThreadTest extends Fu{
    private  String name;

    public ThreadTest() {
    }



    @Override
    protected void run() {
        //super.run();
        System.out.println("子类。。。");
    }

    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
        t.run();
    }
}
