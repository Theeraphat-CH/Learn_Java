import java.util.Scanner;
import java.util.Random;

public class rock_paper_sissor_game {
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int point = 0;

        System.out.print("Rock Paper Sissor Game!");
        
        System.out.print("Press any key to start the game : ");
        String start = scan.next();

        while (start != null) {
            System.out.print("\nEnter Number 1.Rock 2.Paper 3.Sissor : ");
            int game_type = scan.nextInt();

            int game_type_random = random.nextInt(1, 3);

            if (game_type == game_type_random) {
                if (game_type == 1 && game_type_random == 1) {
                    System.out.print("********************\nYou : Rock \nBot : Rock\n********************");
                } else if (game_type == 2 && game_type_random == 2) {
                    System.out.print("********************\nYou : Paper \nBot : Paper\n********************");
                } else if (game_type == 3 && game_type_random == 3) {
                    System.out.print("********************\nYou : Sissor \nBot : Sissor\n********************");
                }
                System.out.print("\nDrawn!\nYour point have "+point+" points\n");
            } else if (game_type == 1 && game_type_random == 2) {
                System.out.print("********************\nYou : Rock \nBot : Paper\n********************");
                point -= 1;
                System.out.print("\nLose!\nYour point have "+point+" points\n");
            } else if (game_type == 2 && game_type_random == 1) {
                System.out.print("********************\nYou : Paper \nBot : Rock\n********************");
                point += 1;
                System.out.print("\nWin!\nYour point have "+point+" points\n");
            } else if (game_type == 3 && game_type_random == 2) {
                System.out.print("********************\nYou : Sissor \nBot : Paper\n********************");
                point += 1;
                System.out.print("\nWin!\nYour point have "+point+" points\n");
            } else if (game_type == 2 && game_type_random == 3) {
                System.out.print("********************\nYou : Paper \nBot : Sissor\n********************");
                point -= 1;
                System.out.print("\nLose!\nYour point have "+point+" points\n");
            } else if (game_type == 3 && game_type_random == 1) {
                System.out.print("********************\nYou : Sissor \nBot : Rock\n********************");
                point -= 1;
                System.out.print("\nLose!\nYour point have "+point+" points\n");
            } else if (game_type == 1 && game_type_random == 3) {
                System.out.print("********************\nYou : Rock \nBot : Sissor\n********************");
                point += 1;
                System.out.print("\nWin!\nYour point have "+point+" points\n");
            }
        }
    }
}
