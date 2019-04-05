// Duplicating indexes in an Array

package com.ListsArraysGenerics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DuplicateWordArrayList {
    public static void main(String[] args) throws Exception {
        // Reading the lines from tconsle and declaring ArrayList list

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        // Printing Result
        for(String i : result) {
            System.out.println(i);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //Duplicating every index in the array
        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.get(i));
            i++; // here we SKIP every 2nd DUPLICATED index
        }
        return list;
    }
}
