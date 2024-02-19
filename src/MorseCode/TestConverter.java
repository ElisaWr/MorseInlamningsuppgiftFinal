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

        Converter converter = new Converter();

        String testData = "T";

        String expected = "_";

        String actual = converter.getMorse(testData);

        assertEquals(expected, actual);
    }

    @Test
    public void testConverterCtoSymbols() {

        Converter converter = new Converter();

        String testData = "C";

        String expected = "_*_*";

        String actual = converter.getMorse(testData);

        assertEquals(expected, actual);
    }

    @Test
    public void testConverterLettersToSymbols() {

        Converter converter = new Converter();

        String testData = "CISSI";

        String expected = "_*_* ** *** *** **";

        String actual = converter.getMorse(testData);

        assertEquals(expected, actual);
    }

    @Test
    public void testConverterSOS() {

        Converter converter = new Converter();

        String testData = "SOS";

        String expected = "*** ___ ***";

        String actual = converter.getMorse(testData);

        assertEquals(expected, actual);
    }

    @Test
    public void testConverterSentenceToSymbols() {

        Converter converter = new Converter();

        String testData = "CISSIS SINNE";

        String expected = "_*_* ** *** *** ** *** / *** ** _* _* *";

        String actual = converter.getMorse(testData);

        assertEquals(expected, actual);
    }
    @Test
    public void testConverterStarToE() {

        Converter converter = new Converter();

        String testData = "*";

        String expected = "E";

        String actual = converter.getAlpha(testData);

        assertEquals(expected, actual);
    }
    @Test
    public void testConverterStarsToH() {

        Converter converter = new Converter();

        String testData = "****";

        String expected = "H";

        String actual = converter.getAlpha(testData);

        assertEquals(expected, actual);
    }

    @Test
    public void testConverterSymbolsToSentence() {

        Converter converter = new Converter();

        String testData = "_*_* ** *** *** ** *** / *** ** _* _* *";

        String expected = "CISSIS SINNE";

        String actual = converter.getAlpha(testData);

        assertEquals(expected, actual);
    }

    @Test
    public void testErrorMessage() {

        Converter converter = new Converter();

        String testData = "_*_* ** *** *** ** *** / B *** ** _* _* *";

        String expected = "incorrect parameters: B";

        String actual = converter.getAlpha(testData);

        assertEquals(expected, actual);
    }
}
