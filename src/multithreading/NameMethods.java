package multithreading;

public class NameMethods {
    public static void main(String[] args) {
        System.out.println("hallo");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Arman");
        System.out.println(Thread.currentThread().getName());
        System.out.println(10);
    }
}
