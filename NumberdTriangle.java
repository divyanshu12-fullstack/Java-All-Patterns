package Patterns;

import java.util.Scanner;

public class NumberdTriangle {
    public static void triangleOfOnes(int rows) {
        int max_spaces = rows - 1;
        int min_stars = 1;
        int current_row = 1;
        while (current_row <= rows) {
            int spaces = 1;
            while (spaces <= max_spaces) {
                System.out.print(" ");
                spaces++;
            }
            int numbers = 1;
            while (numbers <= min_stars) {
                System.out.print("1");
                numbers++;
            }
            max_spaces--;
            min_stars += 2;
            System.out.println();
            current_row++;
        }
    }

    public static void triangleOfConstRows(int rows) {
        int max_spaces = rows - 1;
        int min_stars = 1;
        int current_row = 1;
        while (current_row <= rows) {
            int spaces = 1;
            while (spaces <= max_spaces) {
                System.out.print(" ");
                spaces++;
            }
            int numbers = 1;
            while (numbers <= min_stars) {
                System.out.print(current_row);
                numbers++;
            }
            max_spaces--;
            min_stars += 2;
            System.out.println();
            current_row++;
        }
    }

    public static void triangleOfIncreasingNumbers(int rows) {
        int max_spaces = rows - 1;
        int min_stars = 1;
        int current_row = 1;
        int counter = 1;
        while (current_row <= rows) {
            int spaces = 1;
            while (spaces <= max_spaces) {
                System.out.print("\t");
                spaces++;
            }
            int numbers = 1;
            while (numbers <= min_stars) {
                System.out.print(counter + "\t");
                numbers++;
                counter++;
            }
            max_spaces--;
            min_stars += 2;
            System.out.println();
            current_row++;
        }
    }

    public static void PrintNumberedPattern(int rows) {
        int current_rows = 1;
        int max_spaces = rows - 1;
        int min_numbers = 1;

        while (current_rows <= rows) {

            int current_spaces = 1;
            while (current_spaces <= max_spaces) {
                System.out.print("\t");
                current_spaces++;
            }
            int counter = 1;
            int numbers_printed = 1;
            while (numbers_printed <= min_numbers) {
                if (numbers_printed > current_rows) {
                    counter -= 1;
                    System.out.print(counter + "\t");
                } else if (numbers_printed == current_rows) {
                    System.out.print(counter + "\t");
                } else {
                    System.out.print(counter + "\t");
                    counter++;
                }
                numbers_printed++;
            }
            System.out.println();
            max_spaces--;
            min_numbers += 2;
            current_rows++;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Provide No. of rows: ");
        int rows = scn.nextInt();
        scn.close();

        triangleOfOnes(rows);
        System.out.println();
        System.out.println();
        System.out.println();

        triangleOfConstRows(rows);

        System.out.println();
        System.out.println();
        System.out.println();

        triangleOfIncreasingNumbers(rows);

        System.out.println();
        System.out.println();
        System.out.println();

        PrintNumberedPattern(rows);
    }
}
