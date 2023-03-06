import java.util.Scanner;

public class twoD_array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] Syntax = new String[3][3];

        for (int i = 0; i < Syntax.length; i++) {
            for (int j = 0; j < Syntax[i].length; j++) {
                System.out.print("Enter Syntax :");
                Syntax[i][j] = scan.next();
            }
        }

        for (int i = 0; i < Syntax.length; i++) {
            for (int j = 0; j < Syntax[i].length; j++) {
                System.out.print(Syntax[i][j] + " ");
            }
            System.out.println();
        }
    }
}
