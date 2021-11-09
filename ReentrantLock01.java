package javadevelopmentday04;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock01 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        MyRunnable myRunnable = new MyRunnable(lock);
        Thread thread1 = new Thread(myRunnable, "Passanger-1"); // today's way to name thread
        thread1.start();

        Thread thread2 = new Thread(myRunnable, "Passanger-2");
        thread2.start();

        Thread thread3 = new Thread(myRunnable, "Passanger-3");
        thread3.start();

    }
}
class MyRunnable implements Runnable{
    int ticketsAvaliable = 2; // 1 di bu 2 yaptık
    Lock lock;

    // Constructor
    public MyRunnable(Lock lock)
    {
        this.lock = lock;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is waiting to book the ticket");
        lock.lock();

        if(ticketsAvaliable > 0){
            System.out.println(Thread.currentThread().getName() + " is booking the ticket");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticketsAvaliable--;
            System.out.println(Thread.currentThread().getName() + " is booked the ticket");
            System.out.println("The number of avaliable ticket is " + ticketsAvaliable);
        }else {
            System.out.println(Thread.currentThread().getName() + " couldn't book the ticket");
        }
        lock.unlock();
    }


}