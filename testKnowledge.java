import java.util.Scanner;

public class testKnowledge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Calculate Basic Project");

        System.out.println("Enter : + - x %");
        String math_symbol = scan.nextLine();

        if (math_symbol == "+") {
            System.out.println("\nEnter Number");
            int x = scan.nextInt();

            System.out.println("Enter Number");
            int y = scan.nextInt();

            int result = x + y;
            System.out.println("Result "+x+" + "+y+" = "+result);
        } else if (math_symbol == "-") {
            System.out.println("\nEnter Number");
            int x = scan.nextInt();

            System.out.println("Enter Number");
            int y = scan.nextInt();

            int result = x - y;
            System.out.println("Result "+x+" - "+y+" = "+result);
        } else if (math_symbol == "x") {
            System.out.println("\nEnter Number");
            int x = scan.nextInt();
    
            System.out.println("Enter Number");
            int y = scan.nextInt();

            int result = x * y;
            System.out.println("Result "+x+" x "+y+" = "+result);
        } else if (math_symbol == "%") {
            System.out.println("\nEnter Number");
            int x = scan.nextInt();
    
            System.out.println("Enter Number");
            int y = scan.nextInt();
            
            int result = x / y;
            System.out.println("Result "+x+" % "+y+" = "+result);
        } else {
            System.out.println("NUll");
        }

    }
}
