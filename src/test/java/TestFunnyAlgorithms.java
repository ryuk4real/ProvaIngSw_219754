import org.example.FunnyAlgorithms;
import org.junit.*;

public class TestFunnyAlgorithms {

    static String stringWithDash;
    static String stringWithLeadingSpaces;
    static String stringWithSpecialCharacters;

    static String stringOutOfBound;
    static String stringCorrect;

    @BeforeClass
    public static void Initialize() {
        stringWithDash = "-329";
        stringWithLeadingSpaces = "32749   ";
        stringWithSpecialCharacters = "34_3";
        stringOutOfBound = "2938744";
        stringCorrect = "436";
    }

    @Test()
    public void testStringWithDash() {
        System.out.println("Testing string with dash");
        FunnyAlgorithms.stringToIntConverter(stringWithDash);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithLeadingSpaces() {

        System.out.println("Testing string with leading spaces");
        FunnyAlgorithms.stringToIntConverter(stringWithLeadingSpaces);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringWithSpecialCharacters() {

        System.out.println("Testing string with special characters");
        FunnyAlgorithms.stringToIntConverter(stringWithSpecialCharacters);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringOutOfBound() {

        System.out.println("Testing string out of bound");
        FunnyAlgorithms.stringToIntConverter(stringOutOfBound);

    }

    @Test
    public void testCorrectString() {
        System.out.println("Testing correct string");
        FunnyAlgorithms.stringToIntConverter(stringCorrect);
    }
}
