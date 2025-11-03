import java.util.Scanner;

public class Factorial {
    static int fact=1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
//        if(a==1){
//            System.out.println("1");
//        }
//        int i=2;
//        int b=1;
//        while(i<=a){
//            b=b*i;
//            i++;
//        }
//        System.out.println(b);
        int res;
        Factorial f=new Factorial();
        res=f.CalFact(no);
        System.out.println(res);
        //BY USING RECURSION

    }
    int CalFact(int no){
        if(no>=1){
            fact=fact*no;
            CalFact(no-1);
        }
return fact;
    }
}
