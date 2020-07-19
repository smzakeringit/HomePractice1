package basic;

public class LearnCasting {
    public static void main(String[] args) {
        int price= 10;
        System.out.println("My book price is " + price);
        double newPrice= price; // example for Widening
        System.out.println("My new book price is" + newPrice);

        byte newPrice1= (byte) newPrice; // example of Narrowing
        System.out.println("My narrowing book price is" + " " + newPrice1); // This + is a concatenation here
    }

}
