package by.epamtc.kulikOlga.task03.t02.runner;

import by.epamtc.kulikOlga.task03.t02.entity.Condition;
import by.epamtc.kulikOlga.task03.t02.entity.Order;
import by.epamtc.kulikOlga.task03.t02.logic.ArrayManipulator;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        int[][] jaggedArray = {{1, 2, 5, 3, 8}, {0, 9}, {8}, {1, 2, -4, 1, 3}, {1, 3, -2} };

        int[][] result1 = ArrayManipulator.sortBySum(jaggedArray, Order.ASCENDING);
        System.out.println("JaggedArray sorted by maximum of lines: ");
        for(int i = 0; i < result1.length; i++) {
            for (int j = 0; j < result1[i].length; j++) {
                System.out.print(result1[i][j] + " ");
            }
            System.out.println();
        }

        int[][] result2 = ArrayManipulator.sortByMinOrMax(jaggedArray, Condition.MAX, Order.ASCENDING);
        System.out.println("JaggedArray sorted by maximum of lines: ");
        for(int i = 0; i < result2.length; i++) {
            for (int j = 0; j < result2[i].length; j++) {
                System.out.print(result2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
