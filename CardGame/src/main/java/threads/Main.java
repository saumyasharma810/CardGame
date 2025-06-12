package threads;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 =  new MyThread();

        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);



    }
}
