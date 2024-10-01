package Patterns;

import java.util.Scanner;

public class Pattern_two {

    public static void main(String[] args) {
        System.out.println("Provide No. of rows: ");
        Scanner scn = new Scanner(System.in);
        int rows_limit = scn.nextInt();
        scn.close();

        int rows = 1;
        while (rows <= rows_limit) {
            int cst = 1;
            int nst = rows;
            while (cst <= nst) {
                System.out.print("*");
                cst++;
            }
            System.out.println();
            rows++;
        }
    }
}
