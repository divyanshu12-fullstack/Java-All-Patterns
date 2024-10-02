package Patterns;

import java.util.Scanner;

public class MirrorTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Provide No. of rows: ");
        int rows = scn.nextInt();
        scn.close();

        int current_row = 1;
        int max_spaces = 2 * rows - 3;
        while (current_row <= rows) {
            // First Triamgle
            int current_stars = 1;
            while (current_stars <= current_row) {
                System.out.print("*");
                current_stars++;
            }
            // Printing spaces
            int current_spaces = 1;
            while (current_spaces <= max_spaces) {
                System.out.print(" ");
                current_spaces++;
            }

            // Second Triangle
            current_stars = 1;
            if (current_row == rows) {
                while (current_stars < current_row) {
                    System.out.print("*");
                    current_stars++;
                }
            } else {
                while (current_stars <= current_row) {
                    System.out.print("*");
                    current_stars++;
                }
            }
            System.out.println();
            max_spaces -= 2;
            current_row++;
        }

    }
}
