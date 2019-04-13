package com.ListsArraysGenerics;


import java.util.ArrayList;

public class PuttingIteratorinsideTheCycle {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(7);
        list.add(11);
        list.add(3);
        list.add(15);

        for (int i = 0; i < list.size();) { //убрали увеличение i внутрь цикла
            if (list.get(i) > 5)
                list.remove(i); // не увеличиваем i, если удалили текущий  элемент
            else
                i++; // увеличение цикла внутри лупа

        }

        System.out.println(list);

    }
}
