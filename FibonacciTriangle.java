package Patterns;

import java.util.Scanner;

public class FibonacciTriangle {

    public static int NthFibTerm(int n) {
        if (n <= 1) {
            return n;
        }
        return NthFibTerm(n - 1) + NthFibTerm(n - 2);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        scn.close();
        int current_row = 0;
        int terms_count = 0;

        while (current_row < rows) {
            int cols = 0;
            while (cols <= current_row) {
                System.out.print(NthFibTerm(terms_count) + "\t");
                terms_count++;
                cols++;
            }
            System.out.println("\n");
            current_row++;
        }
    }
}
