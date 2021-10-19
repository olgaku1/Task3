package by.epamtc.kulikOlga.task03.t02.logic;

import by.epamtc.kulikOlga.task03.t02.entity.Condition;
import by.epamtc.kulikOlga.task03.t02.entity.Order;

public class ArrayManipulator {
    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;
    }
    private static int[][] sortedJaggedArray(int[][] array, int[] sortedArray) {
        int[][] tmp = array.clone();
        for (int i = 0; i < array.length; i++) {
            array[sortedArray[i]] = tmp[i];
        }
        return array;
    }

    private static int binarySearch(int[] array, int elementForSearch, Order order) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        int indexOfFoundElement = -1;
        while (firstIndex <= lastIndex) {
            int middleIndex = firstIndex + (lastIndex - firstIndex) / 2;
            if (array[middleIndex] == elementForSearch) {
                indexOfFoundElement = middleIndex;
            }

            switch (order) {
                case ASCENDING:
                    if (array[middleIndex] < elementForSearch) {
                        firstIndex = middleIndex + 1;
                    } else {
                        lastIndex = middleIndex - 1;
                    }
                case DESCENDING:
                    if (array[middleIndex] > elementForSearch) {
                        firstIndex = middleIndex + 1;
                    } else {
                        lastIndex = middleIndex - 1;
                    }

            }

        }
        return indexOfFoundElement;
    }

    private static int[] bubbleSort(int[] array, Order order) {
        int[] copyArray = array.clone();
        int[] sortedArray = new int[array.length];
        boolean isNotSorted = true;
        while (isNotSorted) {
            isNotSorted = false;
            for (int i = 0; i < copyArray.length - 1; i++) {

                switch (order) {
                    case ASCENDING:
                        if (copyArray[i] > copyArray[i + 1]) {
                            isNotSorted = true;
                            swap(copyArray, i, i + 1);

                        }
                    case DESCENDING:
                        if (copyArray[i] < copyArray[i + 1]) {
                            isNotSorted = true;
                            swap(copyArray, i, i + 1);
                        }
                }
            }
            for (int i = 0; i < array.length; i++) {
                sortedArray[i] = binarySearch(copyArray, array[i], order);
            }
        }
        return sortedArray;
    }

    private static int[] countSumsOfLines(int[][] array) {
        int[] sumsOfLines = new int[array.length];
        int sumOfLine = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumOfLine += array[i][j];
            }
            sumsOfLines[i] = sumOfLine;
        }
        return sumsOfLines;
    }

    private static int[] findMinsOrMaxsOfLines(int[][] array, Condition condition) {
        int minOfLine = 0;
        int maxOfLine = 0;
        int[] resultArray = new int[array.length];

        switch (condition) {
            case MAX:
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if (array[i][j] > maxOfLine) {
                            maxOfLine = array[i][j];
                        }
                    }
                    resultArray[i] = maxOfLine;
                }

            case MIN:
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if (array[i][j] < minOfLine) {
                            minOfLine = array[i][j];
                        }
                    }
                    resultArray[i] = minOfLine;
                }

        }
        return resultArray;
    }

    public static int[][] sortBySum(int[][] array, Order order) {
        int[] sumsOfLines = countSumsOfLines(array);
        int[] sortedSums = bubbleSort(sumsOfLines, order);
        return sortedJaggedArray(array, sortedSums);
    }

    public static int[][] sortByMinOrMax(int[][] array, Condition condition, Order order) {
        int[] arrayMinOrMax = findMinsOrMaxsOfLines(array, condition);
        int[] sortedArray = bubbleSort(arrayMinOrMax, order);
        return sortedJaggedArray(array, sortedArray);
    }
}
