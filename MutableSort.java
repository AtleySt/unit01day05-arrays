import java.util.Arrays;

public class MutableSort {
    public static void main(String[] args) {
        int[] a = {2, 2, 2};
        int[] b = {0, 0, 0};

        if ((a[0] > a[1] && a[0] > a[2])&&(a[1]<a[2])) {
            b[2] = a[0];
            b[1] = a[2];
            b[0] = a[1];
        } else if ((a[0] > a[1] && a[0] > a[2])&&(a[2]<a[1])) {
            b[2] = a[0];
            b[1] = a[1];
            b[0] = a[2];
        } else if ((a[1] > a[0] && a[1] > a[2])&&(a[0]<a[2])) {
            b[2] = a[1];
            b[1] = a[2];
            b[0] = a[0];
        } else if ((a[1] > a[0] && a[1] > a[2])&&(a[2]<a[0])) {
            b[2] = a[1];
            b[1] = a[0];
            b[0] = a[2];
        } else if ((a[2] > a[0] && a[2] > a[1])&&(a[1]<a[0])) {
            b[2] = a[2];
            b[1] = a[0];
            b[0] = a[1];
        } else if ((a[2] > a[0] && a[2] > a[1])&&(a[0]<a[1])) {
            b[2] = a[2];
            b[1] = a[1];
            b[0] = a[0];
        } else if (a[0] == a[1] && a[0] == a[2]) {
            b[2] = a[2];
            b[1] = a[1];
            b[0] = a[0];
        }
        a[0] = b[0];
        a[1] = b[1];
        a[2] = b[2];
        System.out.println(Arrays.toString(a));
    }
}
