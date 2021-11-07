package javadevelopmentday02;

public class Multithreading02 {
    public static int counter = 0;
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Counter.count();
                System.out.println("thread1 is completed");
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Counter.count();
                System.out.println("thread2 is completed");
            }
        });
        thread2.start();

    }
}
class  Counter{
    synchronized public static void count() {
        for(int i=1; i<=1000; i++) {
            Multithreading02.counter++;
        }
        System.out.println("Counter: " + Multithreading02.counter);
    }
}