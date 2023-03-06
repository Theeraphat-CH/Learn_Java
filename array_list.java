import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();

        food.add("padthai");
        food.add("tomyumung");
        food.add("kuiking");

        food.set(0, "somtum");
        food.remove(2);
        food.clear();

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
