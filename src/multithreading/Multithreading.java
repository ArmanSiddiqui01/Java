package multithreading;

class Threading implements Runnable {
    public void run() {
        System.out.println("runnable interface is created");
    }
}
public class Multithreading extends Thread{
    public  void run() {
       System.out.println("Thread-0 run process "+Thread.currentThread().getName());
        System.out.println("thread is created");

    }

    public static void main(String[] args) {
        System.out.println("main thread run process "+Thread.currentThread().getName());
        //1.method
        Multithreading m=new Multithreading();
        m.setName("Arman");
        m.start();
        //2.method
        Threading t=new Threading();
        Thread th=new Thread(t);
        th.start();
    }

}
