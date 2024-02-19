package MorseCode;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Converter converter = new Converter();

        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in nåt. morse skrivs med * och _");
        String sentence = scan.nextLine();

        if (sentence.length() <1){
            return;
        }

        if (sentence.charAt(0) == '*' || sentence.charAt(0) == '_') {

            String alphaResult = converter.getAlpha(sentence);
            System.out.println(alphaResult);
        }
        else {

            String morseResult = converter.getMorse(sentence);
            System.out.println(morseResult);
        }
    }
}