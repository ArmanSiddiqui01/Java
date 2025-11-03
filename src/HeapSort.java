public class HeapSort {
    public static void main(String[] args) {
        int[] a = {22, 13, 17, 11, 10, 14, 12};
        HeapSort hs = new HeapSort();
        hs.sort(a);
        hs.print(a);

    }

    void sort(int[] a) {
        int len = a.length;
        for (int i = len / 2 - 1; i >= 0; i--) {
            Heap(a, len, i);
        }
        //SWAP THE ARRAY LIST
        for (int i = len - 1; i >= 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            Heap(a, i, 0);
        }
    }
    //THIS WORKS TO SWAP THE PARENT CHILD CONDITION
    void Heap(int[] a, int n, int i) {
        int largest = i; //PARENT ARRAY INDEX
        int li = 2 * i + 1;//LEFT CHILD INDEX
        int ri = 2 * i + 2;//RIGHT CHILD INDEX
        if (li < n && a[li] > a[largest]) {
            largest = li;
        }
        if (ri < n && a[ri] > a[largest]) {
            largest = ri;
        }
        if (largest != i) {
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;

            Heap(a, n, largest);
        }
    }

    void print(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
