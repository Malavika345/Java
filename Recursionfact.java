import java.util.Scanner;

public class Recursionfact {

    public static void main(String[] args) {
        int num, factorial;
        System.out.println("Enter a number");
        num = new Scanner(System.in).nextInt();
        factorial = fact(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }

    public static int fact(int num) {
        if (num >= 1)
            return num * fact(num - 1);
        else
            return 1;
    }
}