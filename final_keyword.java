public class final_keyword {
    public static void main(String[] args) {
        //final keyword arguments can use for read only after use final you can't edit them
        
        final String hello = "hello";

        /*
            you can't use > hello = "Hello, world!"; < because you use final keyword arguments 
        */

        System.out.println(hello);
    }
}