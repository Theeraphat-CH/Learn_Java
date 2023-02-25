import java.util.Scanner;

public class currency_converter {

    public static int us_dollar_to_bath(int currency) {
        return currency *= 34;
    }

    public static void main(String[] args) {
        System.out.print("Currency Converter");
        System.out.println("Enter currency Us Dollar ");
        
        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter currency Us Dollar ");
            int currency = scan.nextInt();

            int currency_result = us_dollar_to_bath(currency);
            System.out.println("Convert US Dollar To Bath Is "+currency_result+"\n");
        }
    }
}
