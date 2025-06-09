package day1;

import java.util.Scanner;

public class SumOfDigits {
   
    public static int sumDigits(int n) {
      
        if (n == 0) {
            return 0;
        } else {
          
            return (n % 10) + sumDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            int result = sumDigits(number);
            System.out.println("The sum of the digits of " + number + " is: " + result);
        }

        scanner.close();
    }
}
