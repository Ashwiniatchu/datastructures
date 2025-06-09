package day1;

public class MaxMin {
	    public static void main(String[] args) {
	        int[] array = {3, 5, 1, 8, 2, 7};

	        int min = array[0];
	        int max = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < min) {
	                min = array[i];
	            }
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }

	        System.out.println("Minimum value: " + min);
	        System.out.println("Maximum value: " + max);
	    }
	}

