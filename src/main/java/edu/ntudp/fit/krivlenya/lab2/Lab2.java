package edu.ntudp.fit.krivlenya.lab2;

import java.util.Random;
import java.util.Scanner;
public class Lab2 {
    public static final int MAX_RANDOM_VALUE = 100;
    public static final int MIN_RANDOM_VALUE = -100;
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int matrixRows = 0;
        int matrixColumns = 0;

        boolean wrongRows = true;
        while (wrongRows) {
            System.out.print("Enter the number of rows of the matrix (1 - 20): ");
            matrixRows = scanner.nextInt();
            if (matrixRows < 1 || matrixRows > 20) {
                System.out.println("Enter right number!");
            }

            else {
                wrongRows = false;
            }
        }

        boolean wrongColumns = true;
        while (wrongColumns) {
            System.out.print("Enter the number of columns of the matrix (1 - 20): ");
            matrixColumns = scanner.nextInt();
            if (matrixColumns < 1 || matrixColumns > 20) {
                System.out.println("Enter right number!");
            }

            else {
                wrongColumns = false;
            }
        }
        int[][] matrix = new int[matrixRows][matrixColumns];
        int matrixElements = matrixRows * matrixColumns;

        System.out.println("Would you like to fill in the matrix by yourself (1) or randomly? (2)");

        boolean isChoiceIsWrong = true;

        while (isChoiceIsWrong) {
            String firstChoice = scanner.next();
            int choice = Integer.parseInt(firstChoice);

            if (choice == 1) {
                for (int i = 0; i < matrixRows; i++) {
                    for (int j = 0; j < matrixColumns; j++) {
                        System.out.print("Enter " + j + " element of " + i + " row: ");
                        matrix[i][j] = scanner.nextInt();

                    }
                }
                isChoiceIsWrong = false;
            }

            else if (choice == 2) {
                for (int i = 0; i < matrixRows; i++) {
                    for (int j = 0; j < matrixColumns; j++) {
                        matrix[i][j] = random.nextInt(MAX_RANDOM_VALUE - MIN_RANDOM_VALUE) + MIN_RANDOM_VALUE;
                    }
                }
                isChoiceIsWrong = false;
            }

            else {
                System.out.println("Enter 1 or 2!");
            }



        }
        for (int i = 0; i < matrixRows; i++) {
            for (int j = 0; j < matrixColumns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }



        int max = 0;
        for (int i = 0; i < matrixRows; i++) {
            for (int j = 0; j < matrixColumns; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Max = " + max);



        int min = 0;
        for (int i = 0; i < matrixRows; i++) {
            for (int j = 0; j < matrixColumns; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("Min = " + min);



        int sum = 0;
        for (int i = 0; i < matrixRows; i++) {
            for (int j = 0; j < matrixColumns; j++) {
                sum += matrix[i][j];
            }
        }
        float average = (float) sum/matrixElements;
        System.out.printf("Average = " + "%.2f\n",average);



        float product = 1;
        for (int i = 0; i < matrixRows; i++) {
            for (int j = 0; j < matrixColumns; j++) {
                product *= matrix[i][j];
            }
        }
        float geometricMean = product/matrixElements;
        System.out.printf("Geometric Mean = " + "%.2f",geometricMean);
    }
}
