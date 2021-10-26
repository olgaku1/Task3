package by.epamtc.kulikOlga.task03.t01.logic;

import java.util.ArrayList;

public class SearchingInCollection {

    public static boolean binarySearch(int[] array, int elementToSearch) {
        int lastIndex = array.length - 1;
        int firstIndex = 0;
        boolean isFound = false;

        while (firstIndex <= lastIndex) {
            int divisorByHalf = 2;
            int middleIndex = (firstIndex + lastIndex) / divisorByHalf;

            if (array[middleIndex] == elementToSearch) {
                isFound = true;
            }

            if (array[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            } else {
                firstIndex = middleIndex + 1;
            }
        }
        return isFound;
    }

    public int findMaxElement(int[] array) {
        SortingCollection.bubbleSort(array);
        return array[array.length - 1];
    }

    public int findMinElement(int[] array) {
        SortingCollection.bubbleSort(array);
        return array[0];
    }

    public boolean isPrime(int num) {
        boolean isPrime = true;
        if (num == 2 || num == 3) {
            isPrime = true;
        }
        if (num <= 1 || num % 2 == 0 || num % 3 == 0) {
            isPrime = false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public ArrayList<Integer> findPrimeElements(int[] array) {
        ArrayList<Integer> listOfPrime = new ArrayList<>();
        for (int i = 0; i <= array.length; i++) {
            if (isPrime(array[i])) {
                listOfPrime.add(array[i]);
            }
        }
        return listOfPrime;
    }

    public int[] fibonacciNumbers(int[] array) {
        int n = findMaxElement(array);
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < n; ++i) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    public ArrayList<Integer> findFibonacciInArray(int[] array) {
        ArrayList<Integer> listFoundedFibonacci = new ArrayList<>();
        int[] listFibonacci = fibonacciNumbers(array);
        for (int i = 0; i <= listFibonacci.length; i++) {
            if (binarySearch(array, listFibonacci[i])) {
                listFoundedFibonacci.add(listFibonacci[i]);
            }
        }
        return listFoundedFibonacci;
    }

    public ArrayList<Integer> find3DigitWithDifferentElements(int[] array) {
        ArrayList<Integer> listOf3DigitWithDiffElements = new ArrayList<>();
        int element1;
        int element2;
        int element3;
        for (int i = 0; i <= array.length; i++) {
            int leftBorder = 102;
            int rightBorder = 987;
            if (i >= leftBorder && i <= rightBorder) {
                int divisorOf3Digit = 100;
                int divisorOf2Digit = 10;
                element1 = i / divisorOf3Digit;
                element2 = (i % divisorOf3Digit) / divisorOf2Digit;
                element3 = i % divisorOf2Digit;
                if (element1 != element2 && element1 != element3 && element2 != element3) {
                    listOf3DigitWithDiffElements.add(array[i]);
                }
            }

        }
        return listOf3DigitWithDiffElements;
    }
}
