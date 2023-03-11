import java.util.Scanner;

public class BMI_oop {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //BMI_calculation_oop myBMI = new BMI_calculation_oop();

        System.out.println("BMI calculation!");
        System.out.print("\nEnter weight : ");
        double weight = scanner.nextDouble();

        System.out.print("\nEnter high : ");
        double high = scanner.nextDouble();

        BMI_calculation_oop myBMI = new BMI_calculation_oop(weight, high);
    }
}
