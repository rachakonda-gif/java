import java.util.*;

public class calculater {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        float a = sc.nextInt();
        System.out.println("Enter operater:");
        char num = sc.next().charAt(0);
        System.out.println("Enter b:");
        float b = sc.nextInt();

        switch (num) {
            case '+':
                System.out.println("result of two numbers is :" + (a + b));

                break;

            case '/':
                System.out.println("result of two numbers is :" + (double) (a / b));

                break;

            case '-':
                System.out.println("result of two numbers is :" + (a - b));

                break;

            case '*':
                System.out.println("result of two numbers is :" + (a * b));

                break;

            default:
                System.out.println("Exit");
                break;
        }
    }
}