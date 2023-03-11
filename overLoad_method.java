public class overLoad_method {

    static int add(int x, int y) {
        System.out.println("This Is Overloaded Method 1");
        return x + y;
    }

    static int add(int x, int y, int z) {
        System.out.println("This Is Overloaded Method 2");
        return x + y + z;
    }

    static int add(int x, int y, int z, int w) {
        System.out.println("This Is Overloaded Method 3");
        return x + y + z + w;
    }

    public static void main(String[] args) {
        int x = add(1, 2,3);
        System.out.println(x);
    }
}
