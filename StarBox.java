package Patterns;

import java.util.Scanner;

public class StarBox {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Provide No. of rows: ");
        int rows = scn.nextInt();
        scn.close();

        int current_row = 1;
        int max_stars = (int) rows / 2;
        int min_spaces = 1;

        while (current_row <= rows) {

            int stars_first = 1;
            while (stars_first <= max_stars) {
                System.out.print("*");
                stars_first++;
            }

            int spaces = 1;
            while (spaces <= min_spaces) {
                System.out.print(" ");
                spaces++;
            }

            stars_first = 1;
            while (stars_first <= max_stars) {
                System.out.print("*");
                stars_first++;
            }

            if (current_row <= rows / 2) {
                max_stars--;
                min_spaces += 2;
            } else {
                max_stars++;
                min_spaces -= 2;
            }
            System.out.println();
            current_row++;
        }
    }
}
