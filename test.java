public class test{
    public static void main(String[] args) {
    String x = "Banana";
    String y = "Carrots";
    String temp;

    temp = x;
    x = y;
    y = temp;

    System.out.println(x);
    System.out.println(y);

    }
}