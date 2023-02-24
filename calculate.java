import java.util.Scanner;

public class calculate{
    public static void main(String[] args ) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter NUmber : ");
        int x = scan.nextInt();

        System.out.println("Enter NUmber : ");
        int z = scan.nextInt();

        int result = x + z;
        System.out.print(result);

    }
}