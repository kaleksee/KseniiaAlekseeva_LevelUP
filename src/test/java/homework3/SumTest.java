package homework3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class SumTest extends AbstractBaseTest {

    @DataProvider(name = "sumTestPositive")
    public Object[][] sumPositiveTestDataProvider() {
        return new Object[][]{
                {8.333, 9.36, 17.692999999999998},
                {82.66, 47.6, 130.26},
                {-25.3, 309.6, 284.3},
                {-89.4, -5, -94.4}
        };
    }

    @Test(dataProvider = "sumTestPositive")
    public void positiveDataProviderSumTest(double a, double b, double expected) {
        double actual = calculator.sum(a, b);
        assertEquals(actual, expected);
    }

    @DataProvider(name = "sumTestNegative")
    public Object[][] sumNegativeTestDataProvider() {
        return new Object[][]{
                {10.5, 6.9, 88.99},
                {11.7, 7890.0, 8941.02},
                {6669.15, 15.66, -7.8}
        };
    }

    @Test(dataProvider = "sumTestNegative")
    public void negativeDataProviderSumTest(double a, double b, double expected) {
        double actual = calculator.sum(a, b);
        assertNotEquals(actual, expected);
    }

}
