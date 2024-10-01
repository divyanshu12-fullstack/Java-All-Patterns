package Patterns;

import java.util.Scanner;

public class Triangle505 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        scn.close();

        int current_row = 1;
        while (current_row <= rows) {
            int cols = 1;
            while (cols <= current_row) {
                if (cols == 1 || cols == current_row) {
                    System.out.print(current_row + "\t");
                } else {
                    System.out.print(0 + "\t");
                }
                cols++;
            }
            System.out.println();
            current_row++;
        }
    }
}
