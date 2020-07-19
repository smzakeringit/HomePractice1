package basic;
    // + Additive operator
    // - Subtraction
    // * Multiplication
    // / Division
    // % Remainder
public class ArithmeticOperator {
    public static void main(String[] args) {
        int num1=50;
        int num2=10;
        int summation=num1+num2;
        System.out.println(" Total sum is:"+" "+ summation);
        int subtraction=num1-num2;
        System.out.println("Total sum is: "+" "+ subtraction);
        int multiply=num1*num2;
        System.out.println("Total multiplication is"+" "+ multiply);
        int division=num1/num2;
        System.out.println("Total division is : "+" " + division);
        // 50/10 = 5   50-50=0 remain is the rest of value
        // 70/20 = 3   70-60=10 remain rest of the value
        int remainder=num1 % num2;
        System.out.println("Total remainder is: " + " " + remainder);

        double num3=50.5;
        double num4=10;
        double remainder1=num3 % num4;
        System.out.println("Total remainder value is "+" "+ remainder1);
    }
}
