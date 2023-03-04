import java.util.Scanner;
import java.util.Random;

//single play or play with friend

public class tic_tac_toe {

    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        System.out.println("\n= = = = = = = = =\n= p1 = p2 = p3 =\n= p4 = p5 = p6 =\n= p7 = p8 = p9 =\n= = = = = = = = =\n");

        System.out.print("\nWelcome to Tic Tac Toe Game\nPress Any Key To Start...\n=> ");
        scan.nextLine();

        String p1 = " ", p2 = " ", p3 = " ", p4 = " ", p5 = " ", p6 = " ", p7 = " ", p8 = " ", p9 = " ";

        while (true) {

            System.out.println("\nEnter Position : ");
            String position_ttt = scan.next();
            Scanner scan = new Scanner(System.in);

            if (position_ttt.equals("p1")) {
                p1 = "X";
                System.out.println("\n= = = = = = = = =\n= "+ p1 +" = "+p2+" = "+p3+" =\n= "+p4+" = "+p5+" = "+p6+" =\n= "+p7+" = "+p8+" = "+p9+" =\n= = = = = = = = =\n");
            } else if (position_ttt.equals("p2")) {
                p2 = "X";
                System.out.println("\n= = = = = = = = =\n= "+ p1 +" = "+p2+" = "+p3+" =\n= "+p4+" = "+p5+" = "+p6+" =\n= "+p7+" = "+p8+" = "+p9+" =\n= = = = = = = = =\n");
            } else if (position_ttt.equals("p3")) {
                p3 = "X";
                System.out.println("\n= = = = = = = = =\n= "+ p1 +" = "+p2+" = "+p3+" =\n= "+p4+" = "+p5+" = "+p6+" =\n= "+p7+" = "+p8+" = "+p9+" =\n= = = = = = = = =\n");
            } else if (position_ttt.equals("p4")) {
                p4 = "X";
                System.out.println("\n= = = = = = = = =\n= "+ p1 +" = "+p2+" = "+p3+" =\n= "+p4+" = "+p5+" = "+p6+" =\n= "+p7+" = "+p8+" = "+p9+" =\n= = = = = = = = =\n");
            } else if (position_ttt.equals("p5")) {
                p5 = "X";
                System.out.println("\n= = = = = = = = =\n= "+ p1 +" = "+p2+" = "+p3+" =\n= "+p4+" = "+p5+" = "+p6+" =\n= "+p7+" = "+p8+" = "+p9+" =\n= = = = = = = = =\n");
            } else if (position_ttt.equals("p6")) {
                p6 = "X";
                System.out.println("\n= = = = = = = = =\n= "+ p1 +" = "+p2+" = "+p3+" =\n= "+p4+" = "+p5+" = "+p6+" =\n= "+p7+" = "+p8+" = "+p9+" =\n= = = = = = = = =\n");
            } else if (position_ttt.equals("p7")) {
                p7 = "X";
                System.out.println("\n= = = = = = = = =\n= "+ p1 +" = "+p2+" = "+p3+" =\n= "+p4+" = "+p5+" = "+p6+" =\n= "+p7+" = "+p8+" = "+p9+" =\n= = = = = = = = =\n");
            } else if (position_ttt.equals("p8")) {
                p8 = "X";
                System.out.println("\n= = = = = = = = =\n= "+ p1 +" = "+p2+" = "+p3+" =\n= "+p4+" = "+p5+" = "+p6+" =\n= "+p7+" = "+p8+" = "+p9+" =\n= = = = = = = = =\n");
            } else if (position_ttt.equals("p9")) {
                p9 = "X";
                System.out.println("\n= = = = = = = = =\n= "+ p1 +" = "+p2+" = "+p3+" =\n= "+p4+" = "+p5+" = "+p6+" =\n= "+p7+" = "+p8+" = "+p9+" =\n= = = = = = = = =\n");
            }

            //column
            if (p1 == p2 && p2 == p3 && p1 == p3) {
                System.out.println("Game Over!");
                p1 = " "; p2 = " "; p3 = " "; p4 = " "; p5 = " "; p6 = " "; p7 = " "; p8 = " "; p9 = " ";
                System.out.println("\n= = = = = = = = =\n= "+ p1 +" = "+p2+" = "+p3+" =\n= "+p4+" = "+p5+" = "+p6+" =\n= "+p7+" = "+p8+" = "+p9+" =\n= = = = = = = = =\n");
            } else if (p4 == p5 && p5 == p6 && p4 == p6) {
                System.out.println("Game Over!");
                p1 = " "; p2 = " "; p3 = " "; p4 = " "; p5 = " "; p6 = " "; p7 = " "; p8 = " "; p9 = " ";
                System.out.println("\n= = = = = = = = =\n= "+ p1 +" = "+p2+" = "+p3+" =\n= "+p4+" = "+p5+" = "+p6+" =\n= "+p7+" = "+p8+" = "+p9+" =\n= = = = = = = = =\n");
            } else if (p7 == p8 && p8 == p9 && p7 == p9) {
                System.out.println("Game Over!");
                p1 = " "; p2 = " "; p3 = " "; p4 = " "; p5 = " "; p6 = " "; p7 = " "; p8 = " "; p9 = " ";
                System.out.println("\n= = = = = = = = =\n= "+ p1 +" = "+p2+" = "+p3+" =\n= "+p4+" = "+p5+" = "+p6+" =\n= "+p7+" = "+p8+" = "+p9+" =\n= = = = = = = = =\n");
            }

            //rows
            if (p1 == p4 && p4 == p7 && p1 == p7) {
                System.out.println("Game Over!");
                p1 = " "; p2 = " "; p3 = " "; p4 = " "; p5 = " "; p6 = " "; p7 = " "; p8 = " "; p9 = " ";
                System.out.println("\n= = = = = = = = =\n= "+ p1 +" = "+p2+" = "+p3+" =\n= "+p4+" = "+p5+" = "+p6+" =\n= "+p7+" = "+p8+" = "+p9+" =\n= = = = = = = = =\n");
            } else if (p2 == p5 && p5 == p8 && p2 == p8) {
                System.out.println("Game Over!");
                p1 = " "; p2 = " "; p3 = " "; p4 = " "; p5 = " "; p6 = " "; p7 = " "; p8 = " "; p9 = " ";
                System.out.println("\n= = = = = = = = =\n= "+ p1 +" = "+p2+" = "+p3+" =\n= "+p4+" = "+p5+" = "+p6+" =\n= "+p7+" = "+p8+" = "+p9+" =\n= = = = = = = = =\n");
            } else if (p3 == p6 && p6 == p9 && p3 == p9) {
                System.out.println("Game Over!");
                p1 = " "; p2 = " "; p3 = " "; p4 = " "; p5 = " "; p6 = " "; p7 = " "; p8 = " "; p9 = " ";
                System.out.println("\n= = = = = = = = =\n= "+ p1 +" = "+p2+" = "+p3+" =\n= "+p4+" = "+p5+" = "+p6+" =\n= "+p7+" = "+p8+" = "+p9+" =\n= = = = = = = = =\n");
            }

            //Diagonal
            if (p1 == p5 && p5 == p9 && p1 == p9) {
                System.out.println("Game Over!");
                p1 = " "; p2 = " "; p3 = " "; p4 = " "; p5 = " "; p6 = " "; p7 = " "; p8 = " "; p9 = " ";
                System.out.println("\n= = = = = = = = =\n= "+ p1 +" = "+p2+" = "+p3+" =\n= "+p4+" = "+p5+" = "+p6+" =\n= "+p7+" = "+p8+" = "+p9+" =\n= = = = = = = = =\n");
            } else if (p3 == p5 && p5 == p7 && p3 == p7) {
                System.out.println("Game Over!");
                p1 = " "; p2 = " "; p3 = " "; p4 = " "; p5 = " "; p6 = " "; p7 = " "; p8 = " "; p9 = " ";
                System.out.println("\n= = = = = = = = =\n= "+ p1 +" = "+p2+" = "+p3+" =\n= "+p4+" = "+p5+" = "+p6+" =\n= "+p7+" = "+p8+" = "+p9+" =\n= = = = = = = = =\n");
            }
        }
    }
}
