package day1;
	import java.util.Scanner;
	public class Recursivefacfib {

	    public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n; 
	        } else {
	            return fibonacci(n - 1) + fibonacci(n - 2); 
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a non-negative integer to find its Fibonacci number: ");
	        int number = scanner.nextInt();

	        if (number < 0) {
	            System.out.println("Fibonacci is not defined for negative numbers.");
	        } else {
	            int result = fibonacci(number);
	            System.out.println("Fibonacci number at position " + number + " is: " + result);
	        }

	        scanner.close();
	    }
	}



