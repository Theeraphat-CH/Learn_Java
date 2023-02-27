import java.util.Random;
import java.util.Scanner;
import javax.print.DocFlavor.STRING;

public class random_password {

    public static String generateString(Random rng, String characters, int length) {
        char[] text = new char[length];
        for (int i = 0; i < text.length; i++) {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }

    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("\nEnter length of password");
            int number = scan.nextInt();

            String result = generateString(new Random(), "abcdefghijklmnopqrstuvwxyz!@#$%^&*(<{[]}>)0123456789", number);
            System.out.print("\nRandom Password => "+result+"\n");
        }
    }
}