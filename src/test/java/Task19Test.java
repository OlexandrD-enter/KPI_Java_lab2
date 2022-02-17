import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class Task19Test {
    int [] emptyArr;
    int [] filledUniqueArr;
    int [] filledNotUniqueArr;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        emptyArr = new int[] {};
        filledUniqueArr = new int[] {1,2,3};
        filledNotUniqueArr = new int[] {1,2,3,3,2,1};
    }

    @Test
    public void shouldReturnTrueWhenEmptyArr(){
        assertTrue(Task19.countUnique(emptyArr));
    }

    @Test
    public void shouldReturnTrueWhenNotUniqueArr(){
        assertTrue(Task19.countUnique(filledNotUniqueArr));
    }

    @Test
    public void shouldReturnFalseWhenUniqueArr(){
        boolean check = Task19.countUnique(filledUniqueArr);
        assertFalse(check);
    }

    @Test
    public void shouldReturnCorrectMessWhenUniqueArr(){
        Task19.countUnique(filledUniqueArr);
        assertEquals("Unique Number: 1 Index: 0\r\n" +
                "Unique Number: 2 Index: 1\r\n" +
                "Unique Number: 3 Index: 2\r\n", outContent.toString());
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }


}