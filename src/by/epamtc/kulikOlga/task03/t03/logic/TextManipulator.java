package by.epamtc.kulikOlga.task03.t03.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextManipulator {

    public static String replaceLetterByIndex(String text, int index, String letter) {

        String[] brokenText = text.split(" ");
        StringBuilder resultText = new StringBuilder();

        for (String element : brokenText) {
            StringBuilder word = new StringBuilder(element);
            if (index < word.length()) {
                word.replace(index, index + 1, letter);
            }
            resultText.append(word + " ");
        }
        return resultText.toString();
    }

    public static String replaceLetterByIndexRegex(String text, int index, char letter) {
        return text.replaceAll(String.format("(\\b\\p{L}{%d})\\p{L}", index), "$1" + letter);
    }

    public static String correctErrorLetter(String text, String errorString, String correctString) {
        StringBuilder resultText = new StringBuilder();
        String[] words = text.split(" ");

        for (String word : words) {
            word = word.replaceAll(errorString, correctString);
            resultText.append(word).append(" ");
        }
        return resultText.toString();
    }

    public static String correctErrorLetterRegex(String text, String errorString, String correctString) {
        StringBuilder resultText = new StringBuilder(text.toLowerCase());
        Pattern pattern = Pattern.compile(errorString);
        Matcher matcher = pattern.matcher(resultText);
        while (matcher.find()) {
            resultText.replace(matcher.start(), matcher.end(), correctString);
        }
        return resultText.toString();
    }

    public static String replaceByLength(String text, int length, String substring) {
        String[] words = text.split(" ");
        StringBuilder resultText = new StringBuilder();
        for (String word : words) {
            if (word.length() == length) {
                resultText.append(substring).append(" ");
            } else {
                resultText.append(word).append(" ");
            }
        }
        return resultText.toString();
    }

    public static String replaceByLengthRegex(String text, int length, String substring) {
        String[] words = text.split(" ");
        StringBuilder resultText = new StringBuilder();
        Pattern pattern = Pattern.compile("\\b[A-Za-z]{" + length + "}\\b");
        for (String word : words) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                resultText.append(substring).append(" ");
            } else {
                resultText.append(word).append(" ");
            }
        }
        return resultText.toString();
    }

    public static String removeNonLetters(String text) {
        char[] letters = text.toCharArray();
        StringBuilder resultText = new StringBuilder();
        for(char letter : letters){
            if(Character.isLetter(letter)){
                resultText.append(letter).append(" ");
            }
        }
        return resultText.toString();
    }

    public static String removeNonLettersRegex(String text) {
        return text.replaceAll("[^()\\d]", " ");
    }

    public static String removeWordsGivenLengthStartConsonant(String text, int length) {
        String[] words = text.split(" ");
        StringBuilder resultText = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            char first = words[i].charAt(0);
            if (!((words[i].length() % length == 0)
                    && ((first != 'a') && (first != 'e')
                    && (first != 'i') && (first != 'o')
                    && (first != 'u') && (first != 'y')))) {
                resultText.append(words[i]).append(" ");
            }
        }
        return resultText.toString();
    }
}
