package com.atguigu.springboot.springboot04.thread;

import java.util.Collections;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest {
    public static  void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> integerFutureTask = new FutureTask<>(new Thread1());
        new Thread(integerFutureTask).start();
        Integer integer = integerFutureTask.get();
        System.out.println(integer);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        AtomicInteger atomicInteger = new AtomicInteger(3);
        atomicInteger.compareAndSet(3,4);
        atomicInteger.getAndIncrement();

        //Collections.synchronizedMap()
    }

    public static class Thread1 implements Callable<Integer>{
        @Override
        public Integer call() throws Exception {
            return 1;
        }
    }
}
