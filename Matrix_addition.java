/*
 3 3
 1 2 3
 3 2 1
 1 3 2
 1 1 1
 1 1 1
 1 1 1
 result
 2 3 4
 4 3 2
 2 4 3
*/
import java.util.Scanner;

class Matrix_addition {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("3 3\n1 2 3\n3 2 1\n1 3 2\n1 1 1\n1 1 1\n1 1 1\nresult\n2 3 4\n4 3 2\n2 4 3");
        System.out.print("\n* - * - * - * - * - * - *\nEnter size of matrix : ");
        int m = scan.nextInt();
        int n = scan.nextInt();

        long list_a[][] = new long[m][n];
        long list_b[][] = new long[m][n];
        long list_c[][] = new long[m][n];

        System.out.print("\nEnter size of matrix 1 \n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                list_a[i][j] = scan.nextLong();
            }
        }

        System.out.print("\nEnter size of matrix 2 \n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                list_b[i][j] = scan.nextLong();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                list_c[i][j] = list_a[i][j] + list_b[i][j];
            }
        }

        System.out.print("\nResult matrix\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", list_c[i][j]);
            }
            System.out.println();
        }

        scan.close();
    }
}