package Patterns;

import java.util.Scanner;

public class Pattern_one {
    public static void main(String args[]) {
        System.out.println("Provide no. of rows: ");

        Scanner scn = new Scanner(System.in);
        int rows_limit = scn.nextInt();

        // for(int i=0;i<rows_limit;i++){
        // for(int j=0; j<rows_limit;j++){
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }

        int rows = 0;
        while (rows < rows_limit) {
            int cols = 0;
            while (cols < rows_limit) {
                System.out.print("*");
                cols++;
            }
            System.out.print("\n");
            rows++;
        }
        scn.close();
    }
}