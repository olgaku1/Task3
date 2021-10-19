package by.epamtc.kulikOlga.task03.t01.runner;

import by.epamtc.kulikOlga.task03.controller.DataReader;
import by.epamtc.kulikOlga.task03.t01.entity.Array;
import by.epamtc.kulikOlga.task03.t01.logic.SearchingInCollection;

import java.util.ArrayList;

public class Task_01 {

    public static void main(String[] args) {
        int sizeArray = 7;

        Array array = new Array(sizeArray);
        DataReader dataReader = new DataReader();

        array.setArray(dataReader.readArrayFromConsole(sizeArray));

        SearchingInCollection search = new SearchingInCollection();

        System.out.println("Find 13 in array? " + search.binarySearch(array.getArray(), 13));
        System.out.println("Max element: " + search.findMaxElement(array.getArray()));
        System.out.println("Min element: " + search.findMinElement(array.getArray()));
        System.out.println("Prime elements: ");
        ArrayList<Integer> result = search.findPrimeElements(array.getArray());
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Fibonacci in array: ");
        ArrayList<Integer> result1 = search.findFibonacciInArray(array.getArray());
        for (int i : result1) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Unique three-digit numbers: ");
        ArrayList<Integer> result2 = search.find3DigitWithDifferentElements(array.getArray());
        for (int i : result2) {
            System.out.print(i + " ");
        }
    }
}
