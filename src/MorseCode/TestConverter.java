package MorseCode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConverter {

    @Test
    public void testConverterEtoStar() {

        // Mitt objekt där jag kan göra konvertering (en ny klass)
        Converter converter = new Converter();

        //Testdata = E
        String testData = "E";

        //Expected = *
        String expected = "*";

        //Actual =
        String actual = converter.getMorse(testData);

        // Actual + Expected
        assertEquals(expected, actual);
    }

    @Test
    public void testConverterTtoLine() {

        // Mitt objekt där jag kan göra konvertering (en ny klass)
        Converter converter = new Converter();

        //Testdata = E
        String testData = "T";

        //Expected = *
        String expected = "_";

        //Actual =
        String actual = converter.getMorse(testData);

        // Actual + Expected
        assertEquals(expected, actual);
    }

    @Test
    public void testConverterCtoSymbols() {

        // Mitt objekt där jag kan göra konvertering (en ny klass)
        Converter converter = new Converter();

        //Testdata = E
        String testData = "C";

        //Expected = *
        String expected = "_*_*";

        //Actual =
        String actual = converter.getMorse(testData);

        // Actual + Expected
        assertEquals(expected, actual);
    }

    @Test
    public void testConverterLettersToSymbols() {

        // Mitt objekt där jag kan göra konvertering (en ny klass)
        Converter converter = new Converter();

        //Testdata = E
        String testData = "CISSI";

        //Expected = *
        String expected = "_*_* ** *** *** **";

        //Actual =
        String actual = converter.getMorse(testData);

        // Actual + Expected
        assertEquals(expected, actual);
    }

    @Test
    public void testConverterSOS() {

        // Mitt objekt där jag kan göra konvertering (en ny klass)
        Converter converter = new Converter();

        //Testdata = E
        String testData = "SOS";

        //Expected = *
        String expected = "*** ___ ***";

        //Actual =
        String actual = converter.getMorse(testData);

        // Actual + Expected
        assertEquals(expected, actual);
    }

    @Test
    public void testConverterSentenceToSymbols() {

        // Mitt objekt där jag kan göra konvertering (en ny klass)
        Converter converter = new Converter();

        //Testdata = E
        String testData = "CISSIS SINNE";

        //Expected = *
        String expected = "_*_* ** *** *** ** *** / *** ** _* _* *";

        //Actual =
        String actual = converter.getMorse(testData);

        // Actual + Expected
        assertEquals(expected, actual);
    }
    @Test
    public void testConverterStarToE() {

        // Mitt objekt där jag kan göra konvertering (en ny klass)
        Converter converter = new Converter();

        //Testdata = E
        String testData = "*";

        //Expected = *
        String expected = "E";

        //Actual =
        String actual = converter.getAlpha(testData);

        // Actual + Expected
        assertEquals(expected, actual);
    }
    @Test
    public void testConverterStarsToH() {

        // Mitt objekt där jag kan göra konvertering (en ny klass)
        Converter converter = new Converter();

        //Testdata = E
        String testData = "****";

        //Expected = *
        String expected = "H";

        //Actual =
        String actual = converter.getAlpha(testData);

        // Actual + Expected
        assertEquals(expected, actual);
    }

    @Test
    public void testConverterSymbolsToSentence() {

        // Mitt objekt där jag kan göra konvertering (en ny klass)
        Converter converter = new Converter();

        //Expected = *
        String testData = "_*_* ** *** *** ** *** / *** ** _* _* *";

        //Testdata = E
        String expected = "CISSIS SINNE";

        //Actual =
        String actual = converter.getAlpha(testData);

        // Actual + Expected
        assertEquals(expected, actual);
    }
}
// Mitt objekt där jag kan göra konvertering (en ny klass)

//testdata = E

//expected = *

//Konverteringen utförs genom att skicka in testdata till konverteringsklassen
//Jag förväntar mig att min actual är samma som expected
//actual

//jämföra expected mot actual


//Fler testfall som jag vill testa
//T = -
//Z = --**
//* = E
//*** = S
//*- = A
//a = *-
//! = error/[]
//HEJ = **** * *---
//-*-* = C
//-* -* = NN -* -* = NN
//HEJ HEJ = **** * *--- / **** * *---
