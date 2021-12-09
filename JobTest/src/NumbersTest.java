import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumbersTest {

    @Test
    public void testNumbers() {
        Numbers numbers = new Numbers();

        // Multiplication
        Assertions.assertEquals(10, numbers.mathematics(2, 5).get(0), "Invalid multiplication result");
        Assertions.assertEquals(24, numbers.mathematics(8, 3).get(0), "Invalid multiplication result");
        Assertions.assertEquals(0, numbers.mathematics(0, 5).get(0), "Invalid multiplication result");
        Assertions.assertEquals(8.75, numbers.mathematics(2.5, 3.5).get(0), "Invalid multiplication result");

        // Division
        Assertions.assertEquals(2, numbers.mathematics(8, 4).get(1), "Invalid division result");
        Assertions.assertEquals(2.25, numbers.mathematics(9, 4).get(1), "Invalid division result");
        Assertions.assertEquals(0, numbers.mathematics(0, 2).get(1), "Invalid division result");
        Assertions.assertEquals(Double.POSITIVE_INFINITY, numbers.mathematics(1, 0).get(1), "Invalid division result");

        // Remaining
        Assertions.assertEquals(5, numbers.mathematics(11, 6).get(2), "Invalid remainder result");
        Assertions.assertEquals(1, numbers.mathematics(9, 4).get(2), "Invalid remainder result");
        Assertions.assertEquals(0, numbers.mathematics(7, 7).get(2), "Invalid remainder result");

        // Size
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> numbers.mathematics(1, 1).get(3), "Array is has more elements than anticipated");
    }
}
