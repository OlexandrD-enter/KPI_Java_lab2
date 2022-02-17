import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class Task9Test {
    List<Integer> list;

    @Before
    public void setUp(){
        list = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 6, 4, 2));
    }

    @Test
    public void shouldReturnCorrectCompareResultWhenDiffNumbers() {
        assertEquals(1, Task9.compare(1, 2));
        assertEquals(-1, Task9.compare(2, 1));
    }

    @Test
    public void shouldReturnCorrectCompareResultWhenEvenNumbers() {
        assertEquals(-1, Task9.compare(2, 4));
        assertEquals(1, Task9.compare(4, 2));
    }

    @Test
    public void shouldReturnCorrectCompareResultWhenOddNumbers() {
        assertEquals(1, Task9.compare(3, 5));
        assertEquals(-1, Task9.compare(5, 3));
        assertEquals(0, Task9.compare(-1, -1));
    }

    @Test
    public void shouldReturnCorrectCompareResultWhenNegativeNumbers() {
        assertEquals(0, Task9.compare(-1, -1));
    }

    @Test
    public void shouldReturnCorrectListAfterSort(){
        assertEquals(Arrays.asList(2,4,6,8,7,5,3,1) , Task9.sortOddArray(list));
    }
}