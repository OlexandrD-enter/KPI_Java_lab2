import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.rules.ExpectedException;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

public class Task24Test {

    String dateWithLeapYear;
    String dateWithoutLeapYear;
    String notValidData;

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Before
    public void setUp(){
        dateWithLeapYear = "01 03 true";
        dateWithoutLeapYear = "01 03 false";
        notValidData = "29 02 false";
    }

    @Test
    public void shouldReturnCorrectDateOfYearWhenDateWithLeap(){
        assertEquals(61, Task24.dayOfYear(dateWithLeapYear));
    }

    @Test
    public void shouldReturnCorrectDateOfYearWhenDateWithoutLeap(){
        assertEquals(60, Task24.dayOfYear(dateWithoutLeapYear));
    }

    @Test
    public void shouldReturnNumberFormatExceptionWhenNotValidData(){
        Throwable exception = assertThrows(NumberFormatException.class,
                () -> Task24.dayOfYear(notValidData));
        Assertions.assertEquals("Not valid data for this not leap year", exception.getMessage());
    }

}