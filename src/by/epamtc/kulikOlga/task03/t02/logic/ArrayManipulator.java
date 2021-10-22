package by.epamtc.kulikOlga.task03.t02.logic;


import by.epamtc.kulikOlga.task03.t02.entity.IOrder;
import by.epamtc.kulikOlga.task03.t02.entity.ISorter;


public class ArrayManipulator {
    public static void swap(int[] array, int firstIndex, int secondIndex) {
        int tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;
    }

    public static void swap(int[][] array, int firstIndex, int secondIndex) {
        int[] tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;
    }

    public static void sort(int[][] jaggedArray, ISorter sorter, IOrder order) {
        int[] arrayOfParameters = sorter.countParameterForSort(jaggedArray);
        order.bubbleSort(arrayOfParameters, jaggedArray);

    }
}
