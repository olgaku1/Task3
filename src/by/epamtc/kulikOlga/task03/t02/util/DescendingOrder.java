package by.epamtc.kulikOlga.task03.t02.util;

import by.epamtc.kulikOlga.task03.t02.logic.ArrayManipulator;
import by.epamtc.kulikOlga.task03.t02.util.IOrder;

public class DescendingOrder implements IOrder {
    @Override
    public void bubbleSort(int[] arrayOfParameters, int[][] jaggedArray) {
        for (int j = arrayOfParameters.length; j > 0; j--) {
            boolean isSorted = false;
            for (int i = 1; i < j; i++) {
                if (arrayOfParameters[i - 1] < arrayOfParameters[i]) {
                    ArrayManipulator.swap(arrayOfParameters, i - 1, i);
                    ArrayManipulator.swap(jaggedArray, i - 1, i);
                    isSorted = true;

                }
            }
            if (!isSorted) {
                break;
            }
        }
    }
}
