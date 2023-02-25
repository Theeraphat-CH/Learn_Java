import java.util.Scanner;
import java.util.Random;

public class guessing_game {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            Random random = new Random();

            System.out.println("\nGuessing game");

            System.out.print("Enter Number [1-10] : ");
            int number = scan.nextInt();

            int random_number_use = 10;
            int result = random.nextInt(random_number_use);

            if (number == result) {
                System.out.print(
                    "Congratulations!"+"\n"+
                    "Guessing game NUmber IS "+result+"\n"
                );
            } else {
                System.out.print(
                    "Sorry!"+"\n"+
                    "Guessing game NUmber IS "+result+"\n"
                );
            }
        }
    }
}
