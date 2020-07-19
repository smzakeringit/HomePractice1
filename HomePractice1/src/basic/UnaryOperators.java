package basic;

public class UnaryOperators {
        // Increment Operator: ++ always add 1
        // PreIncrement: ++number
        // PostIncrement: number++
        // Decrement Operator
        // PreDecrement: --number
        // PstDecrement: number--
        public static void main(String[] args) {
            int number=20;
            // PreIncrement: ++number
            ++number; // 1+number 1+20
            System.out.println(number); //21
            // PostIncrement: number++
            // number++;
            System.out.println(number++); // number+ 1 for next line 21+1
            System.out.println(number); // 22
            --number; // -1+22  result 21
            System.out.println(number); // 21
            number--; // number-1 for future use // 21
            System.out.println(); // -1 +number -1+21   result is 20

            System.out.println("*********");
            number--; // 20
            System.out.println(number); // 20
            number--; // 19
            System.out.println(number); // 20
            number--; // 18   -1
            --number; // 16   -1-1+18
            --number; // 15
            System.out.println(number); // 15
            ++number; // 16
            number--; //16
            System.out.println(number);
            number--; //15
            ++number; //15
            ++number; //16
            System.out.println(number); //16
    }
}
