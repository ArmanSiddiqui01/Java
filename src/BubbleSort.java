public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {4, 3, 1, 2, 5};
        BubbleSort bs = new BubbleSort();
        bs.bubble(a);
        bs.print(a);
    }

    void bubble(int[] a) {
        for (int i = 1; i < a.length; i++) {
            boolean swaped = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swaped = true; //swap is not done than swaped value is already false
                }
            }
            if (!swaped) {
                break;
            }
        }
    }

    void print(int[] a) {
        for (int k : a) {
            System.out.print(k + " ");
        }
    }
}