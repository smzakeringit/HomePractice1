package basic;

public class ConditionalOperator {
    // && Conditional AND: All condition must have to be true
    // || Conditional OR: '|| = Pipe' if one condition is true than block of code will execute
    // false || false = false
    // false || true = true
    // true || false = true
    // true || true = true
    public static void main(String[] args) {
        int num1=65;
        int num2=40;
        if (num1==num2){
            System.out.println("Total of num1 and num2 is Equal");
        }
            // if true then this line will print
            // all condition must have to be true
            if (num1==65 && num2==40){
                System.out.println("We like PnT");
                // if one condition is true then the block of code will execute
            }
            if (num1==65 || num2==45){
                System.out.println("We like to do mentoring to be confident");
            }
    }
}
