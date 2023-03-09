public class function {
    static void helloWOrld() {
        System.out.println("Hello world");
    }

    static void hello(String name) {
        System.out.println("Hello " + name);
    }

    static int plus(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        helloWOrld();

        hello("nate");

        System.out.println(plus(5, 5));;
    }
}
