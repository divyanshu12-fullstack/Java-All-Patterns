package Patterns;

import java.util.Scanner;

public class EmptySquare {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int rows = 1;
        int nst = n;
        int nsp = 1;
        int nst_2 = n;
        while (rows <= n) {
            int cst = 1;
            while (cst <= nst) {
                System.out.print("*");
                cst++;
            }
            int csp = 1;
            while (csp <= nsp) {
                System.out.print("*");
                csp++;
            }
            int cst_2 = 1;
            while (cst_2 <= nst_2) {
                System.out.print("*");
                cst_2++;
            }   
            System.out.println();
            rows++;
        }
        
    }
}
