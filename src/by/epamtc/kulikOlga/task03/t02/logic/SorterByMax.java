package by.epamtc.kulikOlga.task03.t02.logic;

import by.epamtc.kulikOlga.task03.t02.entity.ISorter;

public class SorterByMax implements ISorter {

    @Override
    public int[] countParameterForSort(int[][] jaggedArray) {
        int maxOfLine = 0;
        int[] resultArray = new int[jaggedArray.length];

        for (int i = 0; i < jaggedArray.length; i++) {
            maxOfLine = jaggedArray[i][0];
            for (int j = 0; j < jaggedArray[i].length; j++) {
                if (jaggedArray[i][j] > maxOfLine) {
                    maxOfLine = jaggedArray[i][j];
                }
            }
            resultArray[i] = maxOfLine;

        }
        return resultArray;
    }
}
