package Patterns;

import java.util.Scanner;

public class In_right_tri {
    public static void main(String[] args) {

        System.out.println("Provide no. of rows: ");
        Scanner scn = new Scanner(System.in);
        int rows_limit = scn.nextInt();
        scn.close();

        // int rows=1;
        // while(rows<=rows_limit){
        // int cols=rows_limit-rows+1;
        // while(cols>=1){
        // System.out.print("*");
        // cols--;
        // }
        // System.out.print("\n");
        // rows++;
        // }

        int cols = rows_limit;
        for (int rows = 1; rows <= rows_limit; rows++) {
            for (int i = cols; i >= 1; i--) {
                System.out.print("*");
            }
            cols--;
            System.out.print("\n");
        }

    }
}
