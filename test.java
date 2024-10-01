package Patterns;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Provide no. of rows: ");
        Scanner scn = new Scanner(System.in);
        int rows_limit = scn.nextInt();
        scn.close();

        int rows = 1;
        int nsp = rows_limit - 1;
        int nst = 1;
        // Rows
        while (rows <= rows_limit) {
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
            nsp--;
            nst++;
            rows++;
        }
    }
}
