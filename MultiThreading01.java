package javadevelopmentday02;

public class MultiThreading01 {
    public static void main(String[] args) throws InterruptedException {
        // Running the code w/o using MultiThreading
        long StartingTime00 = System.currentTimeMillis();
        CounterWithoutMultiThread obj1 = new CounterWithoutMultiThread(1);
        obj1.countMe();
        System.out.println("=========================");
        CounterWithoutMultiThread obj2 = new CounterWithoutMultiThread(2);
        obj2.countMe();
        long EndingTime00 = System.currentTimeMillis();
        System.out.println("Duration Without Multi thread: " + (EndingTime00 - StartingTime00));

        // Running the code with using MultiThreading
        long StartingTime01 = System.currentTimeMillis();
        CounterWithMultiThread obj3 = new CounterWithMultiThread(3);
        obj3.start();
        System.out.println("========================");
        CounterWithMultiThread obj4 = new CounterWithMultiThread(4);
        obj4.start();
        //Thread.sleep(5000);
        obj4.join();
        long EndingTime01 = System.currentTimeMillis();
        System.out.println("Duration With Multi Thread: " + (EndingTime01 - StartingTime01));

    }
}
class  CounterWithoutMultiThread{
    private int threadNum;

    public CounterWithoutMultiThread(int threadNum) {
        this.threadNum = threadNum;
    }
    public void countMe() {
        for(int i=1; i<=9; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i: " + i + " Thread Number:" + threadNum);
        }
    }
}

class  CounterWithMultiThread extends Thread{
    private int threadNum;

    public CounterWithMultiThread(int threadNum) {
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        countMe();
    }

    public void countMe() {
        for(int i=1; i<=9; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i: " + i + " Thread Number:" + threadNum);
        }
    }
}
/*
If we have multiple objects, use join. If you use threads with different objects,
 synchronized doesn't work. In that case, use "join"

 */