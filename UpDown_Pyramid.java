package Patterns;

import java.util.Scanner;

public class UpDown_Pyramid {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Provide No. of rows: ");
        int rows = scn.nextInt();
        scn.close();

        int current_row = 1;
        int max_spaces = rows / 2;
        int min_stars = 1;
        while (current_row <= rows) {

            for (int current_spaces = 1; current_spaces <= max_spaces; current_spaces++) {
                System.out.print(" ");
            }

            for (int current_stars = 1; current_stars <= min_stars; current_stars++) {
                System.out.print("*");
            }

            if (current_row <= rows / 2) {
                min_stars += 2;
                max_spaces--;
            } else {
                max_spaces++;
                min_stars -= 2;
            }

            System.out.println();
            current_row++;
        }
    }
}
