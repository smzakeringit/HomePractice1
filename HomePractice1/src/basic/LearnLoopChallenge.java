package basic;

import javax.swing.*;

public class LearnLoopChallenge {
    // # Write a program in Java to make such a pattern like
    // right angle triangle with number increased by 1. the pattern like
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    public static void main(String[] args) {
        int height = 5; // 5+1=6
        int count = 1;
        for (int i = 1; i < height + 1; i++) { // 1 loop
            // i=1
            //i=2
            for (int j = 0; j < i; j++) { // 2 loop/ j=1//
                System.out.print(count + " ");
                count++;//2


            } // ++post increament
            System.out.println();
        } //1 loop


    }
}
