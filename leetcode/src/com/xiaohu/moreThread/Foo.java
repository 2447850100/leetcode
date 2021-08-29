package com.xiaohu.moreThread;

import java.util.concurrent.CountDownLatch;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class Foo {
        CountDownLatch second= new CountDownLatch(1);
        CountDownLatch third = new CountDownLatch(1);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        second.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        second.await();
        printSecond.run();
        third.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        third.await();
        printThird.run();
    }

}
