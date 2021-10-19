package by.epamtc.kulikOlga.task03.controller;

import java.io.*;
import java.util.Scanner;

public class DataReader {
    private Scanner scanner;

    public int inputInteger() {
        int num;
        scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("That not an integer.");
            scanner.next();
        }
        num = scanner.nextInt();
        return num;
    }

    public String inputString() {
        scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        return inputText;
    }

    public int[] readArrayFromConsole(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = inputInteger();
        }
        return array;
    }

    public int[] readArrayFromRandom(int size) {
        int[] array = new int[size];
        int leftBorder = 0;
        int rightBorder = 1000;
        for (int i = 0; i < size; i++) {
            array[i] = leftBorder + (int) (Math.random() * rightBorder);
        }
        return array;
    }

    public int[] readArrayFromFile(int size) {
        try {
            scanner = new Scanner(new File("D:\\array.txt"));
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            ;
        }
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public String readStringFromFile() {
        StringBuilder inputText = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader
                            (new FileInputStream("D:\\text.txt")));
            String line;
            while ((line = reader.readLine()) != null) {
                inputText.append(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");;
        } catch (IOException e) {
            System.out.println("Error");;
        }
        return inputText.toString();
    }
}
