import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Main calculator;

    @Before
    public void setUp() { calculator = new Main(); }
    @Test
    public void test_add_positive(){
        float a = 1;
        float b = 2;
        float expectedResult = 3;
        Assert.assertEquals(expectedResult, calculator.add(a,b), 0.1);
    }
    @Test
    public void test_add_negative(){
        float a = 1;
        float b = 2;
        float expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.add(a, b));
    }
    @Test
    public void test_sub_positive(){
        float a = 5;
        float b = 2;
        float expectedResult = 3;
        Assert.assertEquals(expectedResult, calculator.sub(a,b), 0.1);
    }
    @Test
    public void test_sub_negative(){
        float a = 5;
        float b = 2;
        float expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.sub(a, b));
    }
    @Test
    public void test_mul_positive(){
        float a = 6;
        float b = 2;
        float expectedResult = 12;
        Assert.assertEquals(expectedResult, calculator.mul(a,b), 0.1);
    }
    @Test
    public void test_mul_negative(){
        float a = 9;
        float b = 2;
        float expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.mul(a, b));
    }
    @Test
    public void test_div_positive(){
        float a = 8;
        float b = 2;
        float expectedResult = 4;
        Assert.assertEquals(expectedResult, calculator.div(a,b), 0.1);
    }
    @Test
    public void test_div_negative(){
        float a = 1;
        float b = 2;
        float expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.div(a, b));
    }
//    @Test
//    public void test_divbyzero_positive(){
//        float a = 1;
//        float b = 2;
//        float expectedResult = 0;
//        Assert.assertNotEquals(expectedResult, calculator.add(a, b));
//    }
}
