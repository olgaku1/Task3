package by.epamtc.kulikOlga.task03.t02.logic;

import by.epamtc.kulikOlga.task03.t02.entity.ISorter;

public class SorterBySum implements ISorter {

    @Override
    public int[] countParameterForSort(int[][] jaggedArray) {
        int[] sumsOfLines = new int[jaggedArray.length];
        int sumOfLine = 0;
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                sumOfLine += jaggedArray[i][j];
            }
            sumsOfLines[i] = sumOfLine;
            sumOfLine = 0;
        }
        return sumsOfLines;
    }
}
