import java.util.Scanner;

public class calculate_2 {

    public static int plus_fun(int x, int y) {
        return x + y;
    }

    public static int minus_fun(int x, int y) {
        return x - y;
    }

    public static int multiply_fun(int x, int y) {
        return x * y;
    }

    public static int div_fun(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Calculate NUmber");

        System.out.println("Enter Function 1(+) 2(-) 3(x) 4(%)");
        int function_cal = scan.nextInt();

        if (function_cal == 1) {
            System.out.println("Enter Number 1 : ");
            int x = scan.nextInt();

            System.out.println("Enter Number 2 : ");
            int y = scan.nextInt();

            int result = plus_fun(x, y);
            System.out.print(x+" + "+y+" = "+result);
        } else if (function_cal == 2) {
            System.out.println("Enter Number 1 : ");
            int x = scan.nextInt();

            System.out.println("Enter Number 2 : ");
            int y = scan.nextInt();

            int result = div_fun(x, y);
            System.out.print(x+" - "+y+" = "+result);
        } else if (function_cal == 3) {
            System.out.println("Enter Number 1 : ");
            int x = scan.nextInt();

            System.out.println("Enter Number 2 : ");
            int y = scan.nextInt();

            int result = multiply_fun(x, y);
            System.out.print(x+" + "+y+" = "+result);
        } else if (function_cal == 4) {
            System.out.println("Enter Number 1 : ");
            int x = scan.nextInt();

            System.out.println("Enter Number 2 : ");
            int y = scan.nextInt();

            int result = div_fun(x, y);
            System.out.print(x+" % "+y+" = "+result);
        } else {
            System.out.print("NULL");
        }

    }
}
