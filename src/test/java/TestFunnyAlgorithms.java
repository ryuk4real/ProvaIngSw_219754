import org.example.FunnyAlgorithms;
import org.joda.time.DateTime;
import org.junit.*;

public class TestFunnyAlgorithms {

    static String stringWithDash;
    static String stringWithLeadingSpaces;
    static String stringWithSpecialCharacters;

    static String stringOutOfBound;
    static String stringCorrect;

    static FunnyAlgorithms funnyAlgorithms;
    static int[] array;
    static int[] sortedArray;

    static int[] emptyArray;

    static int target;
    static int nonExistingTarget;

    @BeforeClass
    public static void Initialize() {
        stringWithDash = "-329";
        stringWithLeadingSpaces = "32749   ";
        stringWithSpecialCharacters = "34_3";
        stringOutOfBound = "2938744";
        stringCorrect = "436";

        funnyAlgorithms = new FunnyAlgorithms();

        array = new int[]{10, 30, 2, 6};
        sortedArray = new int[]{2, 6, 10, 30};
        emptyArray = new int[]{};

        target = 2;
        nonExistingTarget = 23;
    }

    @Before
    public void printStartTestTime() {
        System.out.println("\nTest start time: " + DateTime.now());
    }

    @After
    public void printEndTestTime() {
        System.out.println("Test end time: " + DateTime.now());
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

    @Test(expected = IllegalArgumentException.class)
    public void testSelectionSortArguments() {
        System.out.println("Testing selection sort arguments");
        funnyAlgorithms.selectionSort(array, -1);
    }

    @Test
    public void testSelectionSortSorting() {
        System.out.println("Testing selection sort sorting");

        funnyAlgorithms.selectionSort(array, 1);
        Assert.assertArrayEquals(array, sortedArray);
    }

    @Test
    public void testBinarySearchTargetExistance() {
        System.out.println("Testing binary search");

        Assert.assertEquals(2, target);
    }

    @Test
    public void testBinarySearchTargetNonexistence() {
        System.out.println("Testing binary search");

        Assert.assertEquals(-1, funnyAlgorithms.binarySearch(array, nonExistingTarget));
    }
}
