package Patterns;

import java.util.Scanner;

public class StarsAndNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Provide No. of rows: ");
        int rows = scn.nextInt();
        scn.close();

        int current_row = 1;
        int max_cols = 1;
        int counter = 1;
        while (current_row <= 2 * rows - 1) {
            int cols = 1;
            while (cols <= max_cols) {
                if (cols % 2 != 0) {
                    System.out.print(counter + "\t");
                } else {
                    System.out.print("*" + "\t");
                }
                cols++;
            }
            if (current_row <= (2 * rows - 1) / 2) {
                max_cols += 2;
                counter++;
            } else {
                max_cols -= 2;
                counter--;
            }
            System.out.println();
            current_row++;
        }
    }
}
