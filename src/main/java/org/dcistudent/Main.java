package org.dcistudent;

import java.util.Scanner;

public class Main {
  public static int recursiveHanoi(int n) {
    if (n == 0) {
      return 0;
    }
    return 2 * recursiveHanoi(n - 1) + 1;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of disks: ");
    int numDisks = scanner.nextInt();

    if (numDisks < 0) {
      System.out.println("Number of disks must be non-negative.");
      return; // Exit the program if the input is invalid
    }

    int moves = recursiveHanoi(numDisks);

    System.out.println("The minimum number of moves required for " + numDisks + " disks is: " + moves);

    scanner.close();
  }
}