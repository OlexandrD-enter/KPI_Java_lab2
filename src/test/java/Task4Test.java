import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class Task4Test {
    int [] emptyArr;
    int [] filledArr;
    int numLessSizeArr;
    int numBiggerSizeArr;

    @Before
    public void setUp(){
        emptyArr = new int[] {};
        filledArr = new int[] {1,2,3,4,5};
        numLessSizeArr = 3;
        numBiggerSizeArr = 7;
    }

    @Test
    public void shouldReturnSameEmptyArrWhenShiftSizeZero(){
        assertEquals(emptyArr, Task4.shiftArray(emptyArr, 0));
    }

    @Test
    public void shouldReturnCorrectArrWhenShiftLessThenSize(){
        assertEquals(Arrays.toString(new int[]{3, 4, 5, 1, 2}), Arrays.toString(Task4.shiftArray(filledArr, numLessSizeArr)));
    }

    @Test
    public void shouldReturnCorrectArrWhenShiftBiggerThenSize(){
        assertEquals(Arrays.toString(new int[]{4, 5, 1, 2, 3}), Arrays.toString(Task4.shiftArray(filledArr, numBiggerSizeArr)));
    }
}
