package squier.john.javacd10;

import java.util.Scanner;
/**
 * Created by johnsquier on 1/12/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.print("Enter a number to see the sum of all numbers from 1 to your number:");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        int sum = 0;

        for ( int i = 1; i <= input; i++ ) {
            sum += i;
        }

        System.out.printf("Sum of all digits from 1 to %d is %d\n", input, sum);
    }
}
