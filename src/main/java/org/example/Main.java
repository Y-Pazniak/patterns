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
        System.out.println(binaryRecursionSearchEugeneOvermind(integers, 9, 0, integers.size() - 1, integers.size()/2));
    }

//    private static int binarySearch(List<Integer> list, int searchNumber) {
//        int pivot = list.size() / 2;
//
//        int startSearch = 0;
//        int endSearch = list.size() - 1;
//
//        while (startSearch <= endSearch) {
//            if (searchNumber == list.get(pivot)) {
//                return pivot;
//            } else {
//                if (searchNumber > list.get(pivot)){
//                    startSearch = pivot + 1;
//                } else {
//                    endSearch = pivot - 1;
//                }
//                //pivot = (startSearch + endSearch) / 2;
//                pivot = startSearch + (endSearch - startSearch)/2;
//            }
//        }
//        return -1;
//    }

    //works fine, but looks terrible
    private static int binaryRecursionSearchEugeneOvermind(final List<Integer> list, final int searchNumber, final int start, final int end, final int pivot) {
        int localPivot;
        int localStart = start;
        int localEnd = end;

        if (start > end) {
            return -1;
        }

        if (searchNumber != list.get(pivot)) {
            if (searchNumber > list.get(pivot)) {
                localStart = pivot + 1;
            } else {
                localEnd = pivot - 1;
            }
            localPivot = (localEnd + localStart) / 2;
        } else {
            return pivot;
        }
        return binaryRecursionSearchEugeneOvermind(list, searchNumber, localStart, localEnd, localPivot);
    }

    //looks and works fine, but not my solution :(
    public static int binarySearchAfterGoogle(final List<Integer> list, final int searchNumber, final int start, final int end) {
        if (start > end) {
            return -1;
        }

        int pivot = start + (end - start) / 2;

        if (searchNumber == list.get(pivot)) {
            return pivot;
        } else {
            if (searchNumber > list.get(pivot)) {
                return binarySearchAfterGoogle(list, searchNumber, pivot + 1, end);
            } else {
                return binarySearchAfterGoogle(list, searchNumber, start, pivot - 1);
            }
        }
    }
}