# Towers of Hanoi
The puzzle “Towers of Hanoi” is a classic example of a recursive procedure. It works like this:

You're given a puzzle with 3 rods and a number of disks with different sizes (no disk has the same size). All of the disks are stacked on the first rod. They're ordered by size with the biggest disk on the bottom and the smallest on top.

The objective of the puzzle is to move the stack of disks to the last rod, following two simple rules:
* Only move one disk at a time.
* Never stack a disk on top of a smaller one.

To move a tower of the size n, we need to 
* move a tower of the size (n - 1) to the second rod
* move the largest disk to the third rod
* move the tower (n - 1) form the second to the third rod.
 
This gives us an equation that we can solve in a recursive manner:
hanoi(n) = 2 * hanoi(n - 1) + 1

## Recursive computation
Build a method that allows you to compute the minimum amount of moves needed for a given user input. Solve this calculation with the equation above and in a recursive manner.

Print the result back to the user.