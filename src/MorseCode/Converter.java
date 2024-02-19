package MorseCode;

import java.util.HashMap;

public class Converter {

    private HashMap<String, String> morseCodeMap = new HashMap<>();
    private HashMap<String, String> alphaMap = new HashMap<>();

    private void createMorseMap() {

        morseCodeMap.put("A", "*_");
        morseCodeMap.put("B", "_***");
        morseCodeMap.put("C", "_*_*");
        morseCodeMap.put("D", "_**");
        morseCodeMap.put("E", "*");
        morseCodeMap.put("F", "**_*");
        morseCodeMap.put("G", "__*");
        morseCodeMap.put("H", "****");
        morseCodeMap.put("I", "**");
        morseCodeMap.put("J", "*___");
        morseCodeMap.put("K", "_*_");
        morseCodeMap.put("L", "*_**");
        morseCodeMap.put("M", "__");
        morseCodeMap.put("N", "_*");
        morseCodeMap.put("O", "___");
        morseCodeMap.put("P", "*__*");
        morseCodeMap.put("Q", "__*_");
        morseCodeMap.put("R", "*_*");
        morseCodeMap.put("S", "***");
        morseCodeMap.put("T", "_");
        morseCodeMap.put("U", "**_");
        morseCodeMap.put("V", "***_");
        morseCodeMap.put("W", "*__");
        morseCodeMap.put("X", "_**_");
        morseCodeMap.put("Y", "_*__");
        morseCodeMap.put("Z", "__**");
        morseCodeMap.put(" ", "/");//Mellanslag
        morseCodeMap.put("1", "*____");
        morseCodeMap.put("2", "**___");
        morseCodeMap.put("3", "***__");
        morseCodeMap.put("4", "****_");
        morseCodeMap.put("5", "*****");
        morseCodeMap.put("6", "_****");
        morseCodeMap.put("7", "__***");
        morseCodeMap.put("8", "___**");
        morseCodeMap.put("9", "____*");
        morseCodeMap.put("0", "_____");
        morseCodeMap.put(".", "*_*_*_");
        morseCodeMap.put(",", "__**__");
        morseCodeMap.put("?", "**__**");

    }

    public String getMorse(String sentence) {
        createMorseMap();

        String symbols = "";
        String result = "";

        for (int i = 0; i < sentence.length(); i++) {
            String letter = String.valueOf(sentence.charAt(i));

            symbols = morseCodeMap.get(letter);

            result = result + symbols;
            if (i < sentence.length() - 1) {
                result = result + " ";
            }
            if (symbols == null){
                return "incorrect parameter: " + letter;
            }
        }

        return result;
    }

    private void createAlphaMap() {

        alphaMap.put("*_", "A");
        alphaMap.put("_***", "B");
        alphaMap.put("_*_*", "C");
        alphaMap.put("_**", "D");
        alphaMap.put("*", "E");
        alphaMap.put("**_*", "F");
        alphaMap.put("__*", "G");
        alphaMap.put("****", "H");
        alphaMap.put("**", "I");
        alphaMap.put("*___", "J");
        alphaMap.put("_*_", "K");
        alphaMap.put("*_**", "L");
        alphaMap.put("__", "M");
        alphaMap.put("_*", "N");
        alphaMap.put("___", "O");
        alphaMap.put("*__*", "P");
        alphaMap.put("__*_", "Q");
        alphaMap.put("*_*", "R");
        alphaMap.put("***", "S");
        alphaMap.put("_", "T");
        alphaMap.put("**_", "U");
        alphaMap.put("***_", "V");
        alphaMap.put("*__", "W");
        alphaMap.put("_**_", "X");
        alphaMap.put("_*__", "Y");
        alphaMap.put("__**", "Z");
        alphaMap.put("/", " ");//Mellanslag
        alphaMap.put("*____", "1");
        alphaMap.put("**___", "2");
        alphaMap.put("***__", "3");
        alphaMap.put("****_", "4");
        alphaMap.put("*****", "5");
        alphaMap.put("_****", "6");
        alphaMap.put("__***", "7");
        alphaMap.put("___**", "8");
        alphaMap.put("____*", "9");
        alphaMap.put("_____", "0");
        alphaMap.put("*_*_*_", ".");
        alphaMap.put("__**__", ",");
        alphaMap.put("**__**", "?");

    }

    public String getAlpha(String sentence) {
        createAlphaMap();

        String letter = "";
        String result = "";
        String[] symbolsArray = sentence.split(" ");

        for (int i = 0; i < symbolsArray.length; i++) {

            String symbols = symbolsArray[i];

            letter = alphaMap.get(symbols);

            if (letter == null){
                return "incorrect parameters: " + symbols;
            }

                result = result + letter;

        }

        return result;
    }
}

   /* public String getMorse(String sentence) {
        createMorseMap();

        String symbols = "";
        String result = "";

        String[] symbolsArray = sentence.split(" ");

        for (int i = 0; i < symbolsArray.length(); i++) {
            //   String letter = String.valueOf(sentence.charAt(i));


            fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];


            symbols = morseCodeMap.get(letter);

            result = result + symbols;
            if (i < sentence.length() - 1) {
                result = result + " ";
            }
        }

        return result;
    }

       /* if (text.equals("E")) {

            return "*";
        } else {
            return "_";
        }*/



