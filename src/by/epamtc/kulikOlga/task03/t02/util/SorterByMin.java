package by.epamtc.kulikOlga.task03.t02.util;

import by.epamtc.kulikOlga.task03.t02.util.ISorter;

public class SorterByMin implements ISorter {

    @Override
    public int[] countParameterForSort(int[][] jaggedArray) {
        int minOfLine = 0;
        int[] resultArray = new int[jaggedArray.length];
        for (int i = 0; i < jaggedArray.length; i++) {
            minOfLine = jaggedArray[i][0];
            for (int j = 0; j < jaggedArray[i].length; j++) {
                if (jaggedArray[i][j] < minOfLine) {
                    minOfLine = jaggedArray[i][j];
                }
            }
            resultArray[i] = minOfLine;
        }
        return resultArray;

    }
}
