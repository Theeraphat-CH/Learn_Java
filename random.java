import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int number = scanner.nextInt();
        number = random.nextInt(number)+1;

        System.out.println(number);
    }
}
