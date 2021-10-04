package yi;



import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CalcTest

{
    /**
     * Create the test case
     *
     */
    @Test
    public void appTest()
    {

        assertEquals(Calc.add(1,1), 2);
    }
    @Test
    public void appTest2()
    {

        assertEquals(Calc.subtract(1,1), 0);
    }

}
