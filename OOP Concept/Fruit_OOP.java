public class Fruit_OOP {
    public static void main(String args[]) {
        
        Fruit myFruit = new Fruit();
        Fruit myFruit2 = new Fruit();

        System.out.println("The fruit is "+myFruit.fruit);
        System.out.println("Price : "+myFruit.price);
        System.out.println("Weight : "+myFruit.weight+" KG.");

        myFruit.slice();

	}
}
