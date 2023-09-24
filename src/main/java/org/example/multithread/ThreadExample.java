package org.example.multithread;

public class ThreadExample {
    public static void main(String[] args) {
        // Create two threads
        PrintNumber thread1 = new PrintNumber("Thread 1");
        PrintNumber thread2 = new PrintNumber("Thread 2");

        // Start the threads
        thread1.start();
        thread2.start();

        System.out.println("Main thread finished");
    }
}

class PrintNumber extends Thread {
    private final String threadName;

    public PrintNumber(String threadName) {
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
