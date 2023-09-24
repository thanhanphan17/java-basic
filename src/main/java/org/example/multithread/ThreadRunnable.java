package org.example.multithread;

public class ThreadRunnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThreadRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyThreadRunnable("Thread 2"));

        thread1.start();
        thread2.start();

        System.out.println("Main thread finished");
    }
}

class MyThreadRunnable implements Runnable {
    private final String threadName;

    public MyThreadRunnable(String threadName) {
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