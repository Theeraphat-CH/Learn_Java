import java.util.Random;

public class DiceRandom {

    Random random;
    int number;

    DiceRandom() {
        random = new Random();
        result();
    }
    
    void result() {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
