import com.javacodegeeks.example.StringCalculator;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StringCalculatorTest {

    StringCalculator calculator;

    @Before
    public void init(){
        calculator = new StringCalculator();
    }

    @Test
    public void testDefaultDelimiters() {
        String input = "1\n2,3,1";
        assertEquals(7,calculator.add(input));
    }

    @Test
    public void testMultiDelimeters(){
        String input = "//[***][%]\n1***2%3%";
        assertEquals(6,calculator.add(input));
    }
    @Test
    public void testNumbersMoreThan1000() {
        String input = "//[***][%]\n1***2%3,2000";
        assertEquals(6,calculator.add(input));
    }
}
