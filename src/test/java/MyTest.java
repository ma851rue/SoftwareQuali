import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import static org.junit.jupiter.api.Assertions.*;

public class MyTest {

    Calculator test;

    @Before
    public void beforeTest() throws Exception {

       test = new Calculator(); //Calculator is tested

    }

    @Test
    public void additionTest() {

        assertEquals(10, test.add(5,5), "5+5 must be 10");
        assertEquals(5, test.add(10,-5), "10+(-5) must be 5");

    }

    @Test
    public void subtractionTest() {

        assertEquals(0, test.sub(5,5), "5-5 must be 0");
        assertEquals(15, test.sub(10,-5), "10-(-5) must be 15");

    }

    @Test
    public void multiplicationTest() {

        assertEquals(25, test.mult(5,5), "5*5 must be 25");
        assertEquals(-25, test.mult(5,-5), "5*(-5) must be -25");

    }

    @Test
    public void divisionTest() {

        assertEquals(5, test.div(25,5), "25/5 must be 5");
        assertEquals(-5, test.div(25,-5), "25/(-5) must be -5");

    }

    @Test(expected = Exception.class)
    public void divideZeroTest() {

        int fail = test.div(1,0);

    }

    @After
    public void tearDown() {

        test = null;

    }
}
