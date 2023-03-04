import java.util.Scanner;

public class Character_checker {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Text : ");
        String text = scan.next();

        String text_capitalize = text.toUpperCase();
        String text_small = text.toLowerCase();

        if (text == text_capitalize) {
            System.out.println("All characters capitalized");
        } else if (text == text_small) {
            System.out.println("All characters small");
        } else {
            System.out.println("Mix");
        }
    }
}
