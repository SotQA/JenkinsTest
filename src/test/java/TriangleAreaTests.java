import org.example.Triangle;
import org.junit.jupiter.api.*;

public class TriangleAreaTests {
    public static Triangle triangle;

    @BeforeEach
    public void initialiseObject() {
        triangle = new Triangle();
        System.out.println("Just initialise an object for the further work.");
    }

    @Test
    public void positiveTriangleAreaTest() {
        double areaResult = triangle.triangleArea(3, 3, 3);
        Assertions.assertEquals(3.897114317029974, areaResult);
    }

    @Test
    public void positiveArguments() {
        double areaResult = triangle.triangleArea(1, 1, 1);
        Assertions.assertFalse(areaResult <= 0);
    }

    @Test
    public void unexpectedResultTest() {
        double areaResult = triangle.triangleArea(2, 3, 4);
        Assertions.assertNotEquals(1000, areaResult, "The area does not equal to 1000!");
    }

    @AfterEach
    public void tearDownTest() {
        System.out.println("It's just a tear down test to understand how it works.");
    }
}
