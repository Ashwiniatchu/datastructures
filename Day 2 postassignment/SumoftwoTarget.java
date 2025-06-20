package day2;

	import java.util.Arrays;

public class SumoftwoTarget {
	    public static void main(String[] args) {
	        int[] arr = {4, 5, 2, 6, 9, 10};
	        int target = 8;
	        Arrays.sort(arr);
	        
	        int left = 0, right = arr.length - 1;
	        while (left < right) {
	            int sum = arr[left] + arr[right];
	            if (sum == target) {
	                System.out.println("Pair found: (" + arr[left] + ", " + arr[right] + ")");
	                return;
	            } else if (sum < target) {
	                left++;
	            } else {
	                right--;
	            }
	        }
	        System.out.println("No pair found with sum " + target);
	    }
	}

