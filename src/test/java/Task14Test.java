import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Task14Test {

    List<Integer> emptyList;
    List<Integer> listPlural;
    List<Integer> listNotPlural;

    @Before
    public void setUpStreams() {
        listPlural = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        listNotPlural = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2));
        emptyList = new ArrayList<>();
    }

    @Test
    public void shouldReturnFalseWhenSizeLessThan2() {
        assertFalse(Task14.repeatedNumber(emptyList));
    }

    @Test
    public void shouldReturnFalseWhenListIsPlural() {
        assertFalse(Task14.repeatedNumber(listPlural));
    }

    @Test
    public void shouldReturnTrueWhenListIsNotPlural() {
        assertTrue(Task14.repeatedNumber(listNotPlural));
    }
}
