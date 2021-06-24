import java.util.Scanner;

class calculator {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        while (n != 9) {
            System.out.print(
                    "\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.square\n6.square root\n7.factorial\n8.power\n9.Exit\nEnter your choice : ");
            n = scan.nextInt();
            switch (n) {
                case 1:
                    addition();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    multi();
                    break;
                case 4:
                    div();
                    break;
                case 5:
                    square();
                    break;
                case 6:
                    root();
                    break;
                case 7:
                    System.out.print("Enter the number : ");
                    int c = scan.nextInt();
                    int ac = fac(c);
                    System.out.println(c + "! = " + ac);
                    break;
                case 8:
                    power();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Invalid selection\n");
            }
        }
    }

    public static void addition() {
        Scanner scan = new Scanner(System.in);
        float a, b;
        System.out.print("Enter the numbers : ");
        a = scan.nextFloat();
        b = scan.nextFloat();
        float c = a + b;
        System.out.println(a + "+" + b + "=" + c);
    }

    public static void sub() {
        float a, b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        a = scan.nextFloat();
        b = scan.nextFloat();
        float c = a - b;
        System.out.println(a + "-" + b + "=" + c);
    }

    public static void multi() {
        Scanner scan = new Scanner(System.in);
        float a, b;
        System.out.print("Enter the numbers : ");
        a = scan.nextFloat();
        b = scan.nextFloat();
        float c = a * b;
        System.out.println(a + "x" + b + "=" + c);
    }

    public static void div() {
        Scanner scan = new Scanner(System.in);
        float a, b;
        System.out.print("Enter the numbers : ");
        a = scan.nextFloat();
        b = scan.nextFloat();
        float c = a / b;
        System.out.println(a + "/" + b + "=" + c);
    }

    public static void square() {
        Scanner scan = new Scanner(System.in);
        float a;
        System.out.print("Enter the numbers : ");
        a = scan.nextFloat();
        double b = Math.pow(a, 2);
        System.out.println(a + "**" + 2 + "=" + b);
    }

    public static void root() {
        Scanner scan = new Scanner(System.in);
        float a;
        System.out.print("Enter the numbers : ");
        a = scan.nextFloat();
        double c = Math.pow(a, .5);
        ;
        System.out.println("root " + a + "=" + c);
    }

    public static void power() {
        Scanner scan = new Scanner(System.in);
        float a, b;
        System.out.print("Enter the numbers : ");
        a = scan.nextFloat();
        b = scan.nextFloat();
        double c = Math.pow(a, b);
        System.out.println(a + "**" + b + "=" + c);
    }

    public static int fac(int c) {
        if (c == 1) {
            return 1;
        } else {
            return (c * fac(c - 1));
        }
    }
}
