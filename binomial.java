import java.util.*;

public class binomial {
    public static int fact(int n) {
        int f = 1;
        // int i;

        for (int i = 1; i <= n; i++) {
            f = f * i;

        }
        return f;

    }

    public static int bio(int n, int m) {
        int fact1 = fact(n);
        int fact2 = fact(m);
        int minus = fact(n - m);
        int binom = fact1 / (fact2 * minus);
        // System.out.println(binom);
        return binom;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n value:-");
        int n = sc.nextInt();
        System.out.println("enter the m value:-");
        int m = sc.nextInt();
        // fact(n);
        int result = bio(n, m);
        System.out.println("result:-" + result);

    }
}