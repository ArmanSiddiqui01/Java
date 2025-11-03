public class SwapNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c;
//        c=a;
//        a=b;
//        b=c;

        //without using third variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
