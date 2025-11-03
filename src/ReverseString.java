import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int leg=name.length();
        String rev="";
        int i= leg-1;
        while(i>=0){
            rev=rev+name.charAt(i);
            i--;
        }
        System.out.println(rev);
    }
}
