package MorseCode;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Converter converter = new Converter();

        Scanner scan = new Scanner(System.in);
        System.out.println("Translator for Morse Code\n" +
                "Enter a sentence in English or in Morse code\n" +
                "Acceptable parameters for English are A-Z (only capital letters),numerals 0-9, and (.,?). Words are separated by spaces.\n" +
                "Acceptable parameters for Morse code are (*) and (_). Words are separated by slash ( / ) with spaces, letters are separated by spaces.");

        String sentence = scan.nextLine();

        if (sentence.length() < 1) {
            return;
        }

        if (sentence.charAt(0) == '*' || sentence.charAt(0) == '_') {

            String alphaResult = converter.getAlpha(sentence);
            System.out.println(alphaResult);
        } else {

            String morseResult = converter.getMorse(sentence);
            System.out.println(morseResult);
        }
    }
}