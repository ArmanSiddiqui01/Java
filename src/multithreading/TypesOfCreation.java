package multithreading;

//1. same as previous clas
//2. performing single task from multiple thread
//3. performing multiple task from single thread
//4. performing multiple task from multiple thread
class Task1 {
    public void run() {
        System.out.println("2 task");
    }
}
class Task2{
    public void run(){
        System.out.println("3 task");
    }
}
class Task3{
    public void run (){
        System.out.println("4 task");
    }
}

public class TypesOfCreation extends Thread {
    public void run() {
        System.out.println("1 thread");
    }

    public static void main(String[] args) {
        //2.
        TypesOfCreation t = new TypesOfCreation();
        t.start();
        TypesOfCreation to = new TypesOfCreation();
        to.start();
        //4.
        Task1 t1=new Task1();
        t1.run();
        Task2 t2=new Task2();
        t2.run();
        Task3 t3=new Task3();
        t3.run();

    }
}
