package javadevelopmentDay03;

public class Volatile {
    volatile public static int flag = 0;
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            // Override
            @Override
            public void run() {
                while (true) {
                    if(flag == 0) {
                        System.out.println("thread1 is running...");
                    }else {
                        break;
                    }
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                flag = 1;
                System.out.println("The value of flag is updated");

            }
        });
        thread2.start();


    }
}
