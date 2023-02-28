import java.util.Scanner;

public class bmi_calculator {
    
    public static int bmi_calculator(int weigth, int high) {
        int bmi = weigth / (high * high);
        return bmi;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("_ _ _ _ _ _ _ _ _ _\nBMI Calculator\n_ _ _ _ _ _ _ _ _ _");
        System.out.print("Enter Your weight : ");
        int weight = scan.nextInt();

        int high = scan.nextInt();
        high /= 10;
        System.out.print("\nEnter your high: ");

        int result = bmi_calculator(weight, high);

        if (result < 18.5) {
            System.out.print("BMI IS "+result+" Underweight\n");
        } else if (result >= 18.5 && result <= 22.9) {
            System.out.print("BMI IS "+result+" Normal\n");
        } else if (result >= 23.0 && result <= 24.9) {
            System.out.print("BMI IS "+result+" Overweight\n");
        } else if (result >= 25.0 && result <= 29.9) {
            System.out.print("BMI IS "+result+" Obesity\n");
        } else if (result >= 30) {
            System.out.print("BMI IS "+result+" Dangerous obesity\n");
        }

    }
}