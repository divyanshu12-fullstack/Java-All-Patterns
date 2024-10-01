package Patterns;

import java.util.Scanner;

public class TRI {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row_limit = scn.nextInt();
        scn.close();

        int nsp = 0;
        int nst = row_limit;
        int rows = 0;
        while (rows <= row_limit) {
            // Printed spaces
            int psp = 1;
            while (psp <= nsp) {
                System.out.print(" ");
                psp++;
            }
            // Printed stars
            int pst = 1;
            while (pst <= nst) {
                System.out.print("*");
                pst++;
            }
            // Prep for next
            System.out.println();
            nsp++;
            nst--;
            rows++;
        }
    }
}
