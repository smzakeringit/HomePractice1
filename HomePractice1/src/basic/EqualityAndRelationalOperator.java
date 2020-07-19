package basic;

public class EqualityAndRelationalOperator {
    // == Equal to
    // != not Equal
    // > Grater than
    // >= Grater than Equal
    // < Less than
    // <= Less than Equal
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 40;
        // True or false
        // if condition is true then if block will execute else it will not execute
        if (num1 == num2) {
            System.out.println("num1 and num2 are Equal");
        }
        if (num1 != num2){
            System.out.println("num1 and num2 are not Equal");
        }
        if (num1 > num2) {
            System.out.println("num1 is grater than num2");
        }
        if (num1 >= num2){
            System.out.println("num1 is grater than Equal num2");
        }
        if (num1 < num2){
            System.out.println("num1 is less than num2");
        }
        if (num1 <= num2){
            System.out.println("num1 is less than Equal num2");
        }
    }
}