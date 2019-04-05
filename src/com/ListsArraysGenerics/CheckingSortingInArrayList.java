package com.ListsArraysGenerics;

/*
Checking the sorting in an Array
Every next string in the ArrayList shoub == OR <
Than the next one
If it's not the case, print the index of the string that breaks the order
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CheckingSortingInArrayList {

    public static void main(String[] args) throws IOException {
        //adding 10 lines from the keyboard

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        // checking the sorting order
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).length() > list.get(i + 1).length()) {
                System.out.println(i+1);
            }
        }
    }
}

