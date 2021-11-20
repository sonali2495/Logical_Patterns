package com.bridgelabz.patterns;

public class Patterns {
    public static void main(String[] args) {
        System.out.println("Program to create Patterns!");
        createPattern();
    }

    /**Purpose: To create patterns
     *
     */
    private static void createPattern() {
        int i, j;
        for (i = 0; i <= 4; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
