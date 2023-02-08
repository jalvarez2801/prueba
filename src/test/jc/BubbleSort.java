package test.jc;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 8, 9, 10, 5, 17, 0, 3, 78};

        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
