package Patterns;

import java.util.Scanner;

public class NumberStars {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Provide No. of rows: ");
        int rows = scn.nextInt();
        scn.close();

        int cols = 1;
        // Making Boxes
        while (cols <= rows) {
            // Numbers Print
            int counter = 1;
            while (counter <= cols) {
                System.out.print(counter);
                counter++;
            }
            // Stars Print
            int totalStars = 1;
            while (totalStars <= (rows - cols)) {
                System.out.print("*");
                totalStars++;
            }
            System.out.println();
            cols++;
        }
    }
}
