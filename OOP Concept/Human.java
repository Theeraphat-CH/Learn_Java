public class Human {

    static String name;
    static int age;
    static double weight;

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    
    void show() {
        System.out.printf("\nName : %s", this.name);
        System.out.printf("\nAge : %d", this.age);
        System.out.printf("\nWeight : %s", this.weight);
    }

    
}
