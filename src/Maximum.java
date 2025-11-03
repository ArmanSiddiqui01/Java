import java.util.Scanner;

class Array {
    void SecondLargest2(int[] a){
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for (int j : a) {
            if (j > largest) {
                second_largest = largest;
                largest = j;
            } else if (second_largest < j && largest != j) {
                second_largest = j;
            }
        }
        if(second_largest==Integer.MIN_VALUE){
            System.out.println("not found");
        }else{
            System.out.println("found "+second_largest);
        }
    }

    void SecondLargest(){
        int[] a={1,3,5,6,7,8};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(i==1){
                break;
            }
        }
        System.out.println("second largest element is "+a[1]);
    }
    void MaxArray(int [] a) {
       // int[] a = {3, 5, 6, 7, 9, 90};
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("the greatest number in array is: " + max);
    }

    void minArray() {
        int[] a = {3, 4, 5, 1, 0};
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Min array from list is: " + min);
    }

    void Searching() {
        Scanner sc = new Scanner(System.in);
        int[] a = {2, 3, 4, 5, 6, 4};
        int x = sc.nextInt();
        int ans = -1;
        for (int i = 0; i < a.length; i++) {
            if (x == a[i]) {
                ans = i;
            }
        }
        if (ans == -1) {
            System.out.println("not found");
        } else {
            System.out.println("Element is found at index: " + ans);
        }
    }
    void NumberOfTimes(){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] b = {3,3,3,3, 4, 5, 1, 0};
        int a=0;
        for (int j : b) {
            if (j == num) {
                a++;
            }
        }
        System.out.println(a);
    }
}

public class Maximum {
    public static void main(String[] args) {
        int[] c = {3, 5, 6, 7, 9, 90};
        Array a = new Array();
        a.SecondLargest2(c);
        /* a.MaxArray(c);
        a.minArray();
        a.Searching();
        a.SecondLargest();
        ArrayInput b = new ArrayInput();
        b.input();
        a.NumberOfTimes();*/


    }
}
