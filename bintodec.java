import java.util.*;

public class bintodec {

    public static void bin(int num) {
        int pow = 0;
        int dec = 0;
        while (num > 0) {
            int lstdgt = num % 10;
            dec = dec + (lstdgt * (int) Math.pow(2, pow));
            pow++;
            num = num / 10;

        }
        System.out.println("binary to decimal:-" + dec);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the binary digit");
        int num = sc.nextInt();
        bin(num);
    }

}