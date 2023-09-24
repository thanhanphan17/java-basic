package org.example.multithread;

/*
    - Extends from Thread class
    - Can not extend from other classes
    - Each thread creates only one object linked to its
 */
public class ThreadExtendExample {
    public static void main(String[] args) {
        // Create two threads
        MyThreadExtend thread1 = new MyThreadExtend("Thread 1");
        MyThreadExtend thread2 = new MyThreadExtend("Thread 2");

        // Start the threads
        thread1.start();
        thread2.start();

        System.out.println("Main thread finished");
    }
}

class MyThreadExtend extends Thread {
    private final String threadName;

    public MyThreadExtend(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(threadName + ": Count " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
