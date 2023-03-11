public class Printf {
    public static void main(String[] args) {
        System.out.printf("Hello, %d",5);
        //%d is a placeholder for number
        System.out.printf("\nHello, %s","World!");
        //%s is a placeholder for string

        System.out.println("\n/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        System.out.println();
        //you can change position of format using %s or %d
        System.out.printf("%d Hello, ",10);
        System.out.printf("\n%s Hello, ","World!");

        System.out.println("\n/*/*/*/*/*/*/*/*/*/*/*/*/*/- Use Case -/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        //Data Type
        //%s
        boolean myBoolean = false;
        char myChar = 'a';
        String myString = "Hello, world!";
        double myDouble = 1.000;
        //%d
        int myInt = 10;

        System.out.printf("The Boolean Is %s", myBoolean);
        System.out.printf("The Character Is %s", myChar);
        System.out.printf("The String Is %s", myString);
        System.out.printf("The Float Is %s", myDouble);

        System.out.printf("The Integer Is %d", myInt);
    }
}


