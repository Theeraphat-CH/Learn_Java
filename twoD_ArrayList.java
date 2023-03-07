import java.util.ArrayList;
import java.util.Scanner;

public class twoD_ArrayList {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> fullCourse = new ArrayList();

        ArrayList<ArrayList<String>> fullCourse_Element = new ArrayList();

        System.out.print("Enter Full Course Times : ");
        int get_fullCourse = scan.nextInt();

        for (int i = 0; i < get_fullCourse; i++) {
            System.out.print("Enter Full Course : ");
            String add_fullCourse = scan.next();
            fullCourse.add(add_fullCourse);
            fullCourse_Element.add(fullCourse);
        }

        System.out.println(fullCourse_Element);

    }
}
