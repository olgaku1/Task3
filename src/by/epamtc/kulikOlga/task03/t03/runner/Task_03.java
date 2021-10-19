package by.epamtc.kulikOlga.task03.t03.runner;

import by.epamtc.kulikOlga.task03.controller.DataReader;
import by.epamtc.kulikOlga.task03.t03.logic.TextManipulator;

public class Task_03 {
    public static void main(String[] args) {
        DataReader reader = new DataReader();
        String text = reader.readStringFromFile();
        System.out.println(TextManipulator.replaceLetterByIndex(text, 3, "o"));
        System.out.println(TextManipulator.removeWordsGivenLengthStartConsonant(text, 5));
        System.out.println(TextManipulator.removeNonLetters(text));
        System.out.println(TextManipulator.replaceByLengthRegex(text, 2, "gif"));
        System.out.println(TextManipulator.correctErrorLetterRegex(text, "ра", "ро"));
    }
}
