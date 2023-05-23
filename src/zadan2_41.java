import java.util.Scanner;
/* вариант 1*/

public class zadan2_41 {
    static double eps = 0.0000001;

    public static double f(double x) {
        return (Math.pow(x, 3) - 4 * Math.pow(x, 2) - 7 * x + 10);
    }

    public static double divideTwo(double a, double b) {
        double x = (a + b) / 2;
        //-3 -1 2
        System.out.println(x);
        if (Math.abs(a - b) > eps) {
            if (f(a) * f(x) < 0) {
                b = x;
            } else {
                a = x;
            }
            divideTwo(a, b);
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        double a = sc.nextDouble();
        System.out.println("b");
        double b = sc.nextDouble();
        divideTwo(a, b);
    }
}
