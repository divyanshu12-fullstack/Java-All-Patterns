package Patterns;

import java.util.Scanner;

public class Mixed {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int nst = 1;
        // Rows
        int TotalRow = 2 * n - 1;
        int CurrentRow = 1;
        while (CurrentRow <= TotalRow) {
            // Current stars
            int cst = 1;
            while (cst <= nst) {
                System.out.print("*");
                cst++;
            }

            // if(CurrentRow<=5) Removed this as it's not general
            System.out.println();
            if (CurrentRow <= TotalRow / 2) {
                nst++;
            } else {
                nst--;
            }

            CurrentRow++;
        }
    }
}
