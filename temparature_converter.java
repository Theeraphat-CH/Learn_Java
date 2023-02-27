import java.util.Scanner;

public class temparature_converter {

    public static int convert_tem_fahr(int temp) {
        int result = (temp*(9/5))+32;
        return result;
    }

    public static int convert_tem_cel(int temp) {
        int result = (temp-32)*5/9;
        return result;
    }

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        while (true) {
        System.out.print("\nEnter Temperature Do You Want Convert [1.Cel to fahr & 2.Fahr too cel] : ");
        int temp_type = scan.nextInt();

        if (temp_type == 1) {
            System.out.print("Enter Celsius : ");
            int temp = scan.nextInt();
            int result = convert_tem_fahr(temp);
            System.out.print("Convert from celsius to fahr is "+result+"\n");
        } else if (temp_type == 2) {
            System.out.print("Enter Celsius : ");
            int temp = scan.nextInt();
            int result = convert_tem_cel(temp);
            System.out.print("Convert from Fahr to celsius is "+result+"\n");
        } else {
            System.out.println("Please enter Temperature Do You Want Convert");
        }
        }
    }
}