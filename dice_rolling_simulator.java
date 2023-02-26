import java.util.Random;
import java.util.Scanner;

public class dice_rolling_simulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.print("\nPress any key : ");
            String key = scan.next();

            if (key != null) {
                int result = random.nextInt(1, 7);
                System.out.print("\n- - - - - - - -\n"+result+"\n- - - - - - - -");
            } else if (key == null) {
                int result = random.nextInt(1, 7);
                System.out.print("\n- - - - - - - -\n"+result+"\n- - - - - - - -\n");
            }
        }
    }
}
