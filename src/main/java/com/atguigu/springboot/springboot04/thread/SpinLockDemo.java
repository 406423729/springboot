package com.atguigu.springboot.springboot04.thread;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

public class SpinLockDemo {
    AtomicReference<Thread> atomicReference = new AtomicReference<>();
    public static void main(String[] args) {
        boolean b = true;
        int i=0;
        do{
            i++;
        }while (i<10);
        System.out.println(i);
//        Collections.synchronizedList()
    }

}
