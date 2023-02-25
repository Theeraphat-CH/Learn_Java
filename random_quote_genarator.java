import java.util.Random;
/*
    import java.util.ArrayList;
    import java.util.List;
*/

public class random_quote_genarator {

    public static void main(String[] args) {
        Random rand = new Random();

        /*
        List<String> quotes = new ArrayList<>();
        quotes.add(
            "Any fool can write code that a computer can understand. Good programmers write code that humans can understand"
        );
        quotes.add(
            "Code is like humor. When you have to explain it, it’s bad"
        );
        quotes.add(
            "Make it work, make it right, make it fast"
        );
        */

        String[] quotes = {
            "Any fool can write code that a computer can understand. Good programmers write code that humans can understand",
            "Good programmers write code that",
            "Code is like humor. When you have to explain it, it’s bad"
        };

        int index = rand.nextInt(quotes.length);

        String quote = quotes[index];

        System.out.print("\n- - - - - - - - - - - - - - - - - - - - - - - - - -\n"+quote+"\n- - - - - - - - - - - - - - - - - - - - - - - - - -");
    }
}