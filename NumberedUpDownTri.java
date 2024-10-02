package Patterns;

import java.util.Scanner;

public class NumberedUpDownTri {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        scn.close();

        int current_row = 1;
        int min_spaces = 0;

        while (current_row <= (2 * rows) + 1) {
            for (int current_space = 1; current_space <= min_spaces; current_space++) {
                System.out.print(" ");
            }

            for (int current_num = rows + 1 - current_row; current_num >= 0; current_num--) {
                System.out.print(current_num);
            }

            for (int current_num = 1; current_num <= rows - current_row + 1; current_num++) {
                System.out.print(current_num);
            }

            if (current_row <= rows) {
                min_spaces++;
            } else {
                min_spaces--;
            }
            System.out.println();
            current_row++;
        }
    }
}
