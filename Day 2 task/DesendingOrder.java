package day2;
	import java.util.Scanner;
	public class DesendingOrder {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();

	        int[] original = new int[n];

	        System.out.println("Enter " + n + " numbers:");
	        for (int i = 0; i < n; i++) {
	            original[i] = scanner.nextInt();
	        }

	        int[] sortedDesc = new int[n];
	        System.arraycopy(original, 0, sortedDesc, 0, n);

	        for (int i = 0; i < n - 1; i++) {
	            int maxIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (sortedDesc[j] > sortedDesc[maxIndex]) {
	                    maxIndex = j;
	                }
	            }
	           
	            int temp = sortedDesc[maxIndex];
	            sortedDesc[maxIndex] = sortedDesc[i];
	            sortedDesc[i] = temp;
	        }

	        System.out.print("Original array: ");
	        printArray(original);

	        System.out.print("Descending sorted array: ");
	        printArray(sortedDesc);

	        scanner.close();
	    }

	    private static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
}
