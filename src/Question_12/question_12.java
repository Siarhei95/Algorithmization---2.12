package Question_12;

import java.util.Scanner;
import java.util.Random;

public class question_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the size of lines: ");
        int lines = scanner.nextInt();
        System.out.print("Enter the size of columns: ");
        int columns = scanner.nextInt();
        int x = 0;
        int[][] a = new int[lines][columns];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Original matrix: ");
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Sorting rows in a matrix in ascending order: ");
        for (int y = 0; y < columns; y++) {
            for (int i = 0; i < lines; i++) {
                for (int j = 0; j < columns-1; j++) {
                    if (a[i][j] > a[i][j+1]) {
                        x = a[i][j];
                        a[i][j] = a[i][j+1];
                        a[i][j+1] = x;
                    }
                }
            }
        }
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Sorting rows in a matrix in descending order: ");
        for (int y = 0; y < columns; y++) {
            for (int i = 0; i < lines; i++) {
                for (int j = 0; j < columns-1; j++) {
                    if (a[i][j] < a[i][j+1]) {
                        x = a[i][j];
                        a[i][j] = a[i][j+1];
                        a[i][j+1] = x;
                    }
                }
            }
        }
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

