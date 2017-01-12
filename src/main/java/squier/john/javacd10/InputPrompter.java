package squier.john.javacd10;

import java.util.Scanner;

/**
 * Created by johnsquier on 1/12/17.
 */
public class InputPrompter {
    Scanner scanner = new Scanner(System.in);
    int input = 0;

    public int getInput() {
        System.out.print("Enter a number to see the sum of all number from 1 to your number:");
        input = scanner.nextInt();
        return input;
    }

    public void displayResults(int result) {
        System.out.printf("Sum of all digits from 1 to %d is %d\n", input, result);
    }
}
