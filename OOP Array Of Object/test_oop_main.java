public class test_oop_main {
    public static void main(String[] args) {

        //test_oop[] refrigerator = new test_oop[3];

        test_oop food1 = new test_oop("Hotdog");
        test_oop food2 = new test_oop("Hamburgers");
        test_oop food3 = new test_oop("Pad Thai");

        test_oop[] refrigerator = {food1,food2,food3};

        //refrigerator[0] = food1;
        //refrigerator[1] = food2;
        //refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
    }
}
