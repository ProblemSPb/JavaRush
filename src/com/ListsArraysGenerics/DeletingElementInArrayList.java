// removing an element from ArrayList
// Iterator

package com.ListsArraysGenerics;

import java.util.ArrayList;
import java.util.Iterator;

public class DeletingElementInArrayList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {

            String x = (String) iterator.next();
            if (x.equals("Two")) {
                iterator.remove();
            }
        }

        System.out.println(list);

    }
}
