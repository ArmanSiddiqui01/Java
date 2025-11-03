public class FibonacciSeries {
    static int a = 0;
    static int b = 1, c;

    public static void main(String[] args) {
        System.out.print(a + " " + b);
//
        //USING RECURSION
        FibonacciSeries f = new FibonacciSeries();
        f.PrintFib(10);
    }

    void PrintFib(int i) {
        if (i >= 1) {
            c = a + b;
            System.out.print(a + " " + b);
            a = b;
            b = c;
            PrintFib(i - 1);
        }
    }
}
