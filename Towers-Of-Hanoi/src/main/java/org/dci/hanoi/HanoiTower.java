package org.dci.hanoi;

import java.util.Scanner;

public class HanoiTower {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of disks: ");
            int n = scanner.nextInt();

            if (n < 1) {
                System.out.println("Please enter a positive number.");
            } else {
                System.out.println("Steps to solve Towers of Hanoi with " + n + " disks:");
                hanoi(n, 'A', 'C', 'B');
            }

            scanner.close();
    }

    private static void hanoi(int n, char a, char c, char b) {
        if (n == 1) {
            System.out.println("Move disk 1 from tower " + a + " to tower " + c);
            return;
        }

        hanoi(n - 1, a, b, c);
        System.out.println("Move disk " + n + " from tower " + a + " to tower " + c);
        hanoi(n - 1, b, c, a);
    }


}
