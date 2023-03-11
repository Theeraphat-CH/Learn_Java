import java.util.Scanner;

public class Calculator_main {
    static Scanner scanner = new Scanner(System.in);
    static int x;
    static int y;
    static Calculator_result calculatorResult = new Calculator_result(x, y);

    public static void main(String[] args) {
        System.out.println("OOP Simple Calculator");
        while (true) {
            System.out.print("Enter Function Of Calculation\n1.+ 2.- 3.x 4./\n=> ");
            String func = scanner.next();
            if (func.contains("1") || func.contains("1.") || func.contains("+")) {
                System.out.print("Enter X : ");
                x = scanner.nextInt();
                System.out.print("Enter Y : ");
                y = scanner.nextInt();
                calculatorResult.plus(x, y);
            } else if (func.contains("2") || func.contains("2.") || func.contains("-")) {
                System.out.print("Enter X : ");
                x = scanner.nextInt();
                System.out.print("Enter Y : ");
                y = scanner.nextInt();
                calculatorResult.minus(x, y);
            } else if (func.contains("3") || func.contains("3.") || func.contains("x") || func.contains("*")) {
                System.out.print("Enter X : ");
                x = scanner.nextInt();
                System.out.print("Enter Y : ");
                y = scanner.nextInt();
                calculatorResult.multiply(x, y);
            } else if (func.contains("4") || func.contains("4.") || func.contains("/") || func.contains("%")) {
                System.out.print("Enter X : ");
                x = scanner.nextInt();
                System.out.print("Enter Y : ");
                y = scanner.nextInt();
                calculatorResult.div(x, y);
            } else {
                System.out.println("Enter Only Function Of Calculation ):");
            }
        }
    }
}