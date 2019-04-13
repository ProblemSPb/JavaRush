// Printing an Array in descending order

package com.Other;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrintArrayDescendingOrder {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {

        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) { // we go only till the middle

            // here we will store a value from the first half of the array
            // until we assign the array[i] a new value from the 2nd part of the array
            int temp = array[i];

            // here we assign the values from the 2nd part to the first part
            // e.g. array[0] = array[10 - 0 - 1 = 9 - the last index] and so on
            array[i] = array[array.length - i - 1];

            // here we finally assign the values from the 1st part to the 2nd part of the array
            // we kept the values in the temp
            // e.g. array [10 - 0 - 1 = 9 the last index] = temp which is holding array[0]
            array[array.length - i - 1] = temp;
        }
    }
}