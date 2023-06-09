import java.util.Scanner;
/* вариант 1*/
public class zadan2_4 {
    static double eps = 0.0000001;

    public static double fx(double x) {
        return (Math.pow(x, 3) - 4 * Math.pow(x, 2) - 7 * x + 10);
    }

    public static double dfx(double x) {
        return (3 * Math.pow(x, 2) - 8 * x - 7);
    }

    public static void solution(double x0, double x1) {
        System.out.println(x1);
        if (Math.abs(x1 - x0) > eps) {
            x0 = x1;
            x1 = x0 - fx(x0) / dfx(x0);
            solution(x0, x1);
        }
    }

    public static void main(String[] args) {
        //-1 -2 5
        Scanner sc = new Scanner(System.in);
        System.out.println("x0");
        double x0 = sc.nextDouble();
        System.out.println("Solution: ");
        double x1 = x0 - fx(x0) / dfx(x0);
        solution(x0, x1);
    }
}
