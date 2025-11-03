public class InsertionSort {
    static void Sort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && a[j] < a[j - 1]) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 6, 8, 0};
        Sort(a);
        for (int val : a) {
            System.out.print(val + " ");
        }
    }
}
