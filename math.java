import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        double x, y, z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width");
        x = scanner.nextDouble();

        System.out.println("Enter height");
        y = scanner.nextDouble();

        z = x * y;
        System.out.println("Area of "+x+" x "+y+" = "+z);
    }
}
