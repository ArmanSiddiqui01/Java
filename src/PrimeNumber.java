import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
//        int t=0;
//        for(int i=2;i<=a-1;i++){
//            if (a%i==0){
//                t=t+1;
//            }
//        }
//        if(t>0){
//            System.out.println("number is not prime");
//        }else{
//            System.out.println("number is prime number");
//        }
        int k=0;
        for(int i=1;i<=a;i++){
            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                    k=k+1;
                }
            }
            if(k>0){
                k=0;
            }else{
                System.out.println(i);
            }
        }

    }
}
