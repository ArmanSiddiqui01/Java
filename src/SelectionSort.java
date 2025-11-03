public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 3, 7};
        select(a);
        for (int val : a) {
            System.out.print(val + " ");
        }
    }

    static void select(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

    }
}
