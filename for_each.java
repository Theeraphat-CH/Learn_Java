public class for_each {
    public static void main(String[] args) {
        String[] animals = {"Dog","Cat","Dragon"};

        /*
            for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        */

        for (String i : animals) {
            System.out.println(i);
        }
    }
}
