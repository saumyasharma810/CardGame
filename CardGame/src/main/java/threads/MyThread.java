package threads;

public class MyThread extends Thread{

    @Override
    public void run(){
        Thread.currentThread().setPriority(1);
        for (int i = 0; i< 20;i++){
            System.out.println(Thread.currentThread().getName()+" thread is running "+Thread.currentThread().getPriority());
        }
    }
}
