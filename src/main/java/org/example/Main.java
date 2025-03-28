package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collections.sort(integers);
        System.out.println(binarySearch(integers, 8));
    }

    private static int binarySearch(List<Integer> list, int searchNumber) {
        int pivot = list.size() / 2;

        int startSearch = 0;
        int endSearch = list.size() - 1;

        while (startSearch <= endSearch) {
            if (searchNumber == list.get(pivot)) {
                return pivot;
            } else {
                if (searchNumber > list.get(pivot)){
                    startSearch = pivot + 1;
                } else {
                    endSearch = pivot - 1;
                }
                pivot = startSearch + (endSearch - startSearch) / 2;
            }
        }
        return -1;
    }
}