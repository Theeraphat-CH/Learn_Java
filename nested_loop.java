import java.util.Scanner;

public class nested_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int rows;
        int column;
        String symbol = "";

        System.out.print("Enter # of rows : ");
        rows = scanner.nextInt();

        System.out.print("Enter # of column : ");
        column = scanner.nextInt();

        System.out.print("Enter symbol to use : ");
        symbol = scanner.next();

        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < column; j++) {
                System.out.print(symbol);
            }
        }
    }
}
