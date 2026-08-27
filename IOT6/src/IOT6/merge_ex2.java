package IOT6;

public class merge_ex2{

    static void mergeSort(String[] a, int l, int r) {

        if (l >= r) return;

        int m = (l + r) / 2;

        mergeSort(a, l, m);
        mergeSort(a, m + 1, r);

        String[] temp = new String[r - l + 1];

        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r) {

            if (a[i].compareTo(a[j]) < 0)
                temp[k++] = a[i++];
            else
                temp[k++] = a[j++];
        }

        while (i <= m)
            temp[k++] = a[i++];

        while (j <= r)
            temp[k++] = a[j++];

        for (i = l, k = 0; i <= r; i++)
            a[i] = temp[k++];
    }

    public static void main(String[] args) {

        String[] a = {
            "Rahul", "Aman", "John", "David", "Vijay",
            "Arun", "Kiran", "Bob", "Ravi", "Anil", "Deepak"
        };

        mergeSort(a, 0, a.length - 1);

        for (String x : a)
            System.out.print(x + " ");
    }
}