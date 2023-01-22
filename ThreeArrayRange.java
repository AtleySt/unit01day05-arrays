// good; I'll show you a way to do this in a more readable (and extensible way) in class
public class ThreeArrayRange {
    public static void main(String[] args) {
        int[] a = {2, 2, 2};
        if ((a[0] > a[1] && a[0] > a[2])&&(a[1]<a[2])) {
            System.out.println(a[0]-a[1]);
        } else if ((a[0] > a[1] && a[0] > a[2])&&(a[2]<a[1])) {
            System.out.println(a[0]-a[2]);
        } else if ((a[1] > a[0] && a[1] > a[2])&&(a[0]<a[2])) {
            System.out.println(a[1]-a[0]);
        } else if ((a[1] > a[0] && a[1] > a[2])&&(a[2]<a[0])) {
            System.out.println(a[1]-a[2]);
        } else if ((a[2] > a[0] && a[2] > a[1])&&(a[1]<a[0])) {
            System.out.println(a[2]-a[1]);
        } else if ((a[2] > a[0] && a[2] > a[1])&&(a[0]<a[1])) {
            System.out.println(a[2]-a[0]);
        } else if (a[0] == a[1] && a[0] == a[2]) {
            System.out.println(0);
        }
    }
}
