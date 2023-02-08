package test.test;

import java.util.Arrays;

public class Orden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {3, 8, 4, 7, 9, 11, 7, 1, 3};

		for (int i = 0; i < numbers.length; i++) {
		    for (int j = 0; j < numbers.length-1; j++) {
		        if (numbers[j] > numbers[j + 1]) {
		            int temp = numbers[j];
		            numbers[j] = numbers[j + 1];
		            numbers[j + 1] = temp;
		        }
		    }
		}
		System.out.println(Arrays.toString(numbers));

	}

}
