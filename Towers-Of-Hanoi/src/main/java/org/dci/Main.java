package org.dci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;


        while (true) {
            System.out.print("Enter the number of disks: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n >= 1) {
                    break;
                } else {
                    System.out.println("Please enter a positive number.");
                }
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next();
            }
        }


        System.out.println("Minimum moves to solve a tower of size " + n + ": " + hanoi(n));

        scanner.close();
    }

    public static int hanoi(int n) {
        if (n == 1) {
            return 1;
        }
        return 2 * hanoi(n - 1) + 1;
    }
}
