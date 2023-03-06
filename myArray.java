public class myArray {
    public static void main(String[] args) {
        String[] fruit = {"Apple", "Banana", "Mango"};

        String[] animal = new String[5];

        animal[0] = "dog";
        animal[1] = "cat";
        animal[2] = "lion";
        animal[3] = "tiger";
        animal[4] = "zebra";

        for (int i = 0; i < animal.length; i++) {
            System.out.println(animal[i]);
        }

        System.out.println();
        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);
        }
    }
}
