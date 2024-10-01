package Patterns;

import java.util.Scanner;

public class RightSidedTri {
    public static void main(String[] args) {

        System.out.println("Provide no. of rows: ");
        Scanner scn = new Scanner(System.in);
        int rows_limit = scn.nextInt();
        scn.close();

        int rows=1;
        
        while(rows<=rows_limit){
            int cols=1;
            while(cols<=rows_limit){
                if(rows+cols>rows_limit){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                cols++;
            }
            System.out.print("\n");
            rows++;
        }
    }   
}
