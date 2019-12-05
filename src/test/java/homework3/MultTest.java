package homework3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class MultTest extends AbstractBaseTest {

    @DataProvider(name = "multiplicationTestPositive")
    public Object[][] multiplyPositiveTestDataProvider() {
        return new Object[][]{
                {3.6, 3.9, 14.00},
                {9.8, 1.1, 10.0},
                {7.33, 6.5, 47.0}
        };
    }

    @Test(dataProvider = "multiplicationTestPositive")
    public void positiveDataProviderMultiplyTest(double a, double b, double expected) {
        double actual = calculator.mult(a, b);
        assertEquals(actual, expected);
    }

    @DataProvider(name = "multiplicationTestNegative")
    public Object[][] multiplyNegativeTestDataProvider() {
        return new Object[][]{
                {10.5, 6.9, 88.99},
                {11.7, 7890.0, 8941.02},
                {6669.15, 15.66, -7.8}
        };
    }

    @Test(dataProvider = "multiplicationTestNegative")
    public void negativeDataProviderMultiplyTest(double a, double b, double expected) {
        double actual = calculator.mult(a, b);
        assertNotEquals(actual, expected);
    }
}
