package homework3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class SubTest extends AbstractBaseTest {
    @DataProvider(name = "subTestPositive")
    public Object[][] subPositiveTestDataProvider() {
        return new Object[][]{
                {8.66, 9.2, -0.5399999999999991},
                {-66.9, -18.23, -48.67},
                {-72.3, 0, -72.3},
        };
    }

    @Test(dataProvider = "subTestPositive")
    public void positiveDataProviderSubtractionTest(double a, double b, double expected) {
        double actual = calculator.sub(a, b);
        assertEquals(actual, expected);
    }

    @DataProvider(name = "subTestNegative")
    public Object[][] subNegativeTestDataProvider() {
        return new Object[][]{
                {10.5, 6.9, 88.99},
                {11.7, 0.2, 9785.633},
                {10000.785, 15.56, -7.8}
        };
    }

    @Test(dataProvider = "subTestNegative")
    public void negativeDataProviderSubtractionTest(double a, double b, double expected) {
        double actual = calculator.sub(a, b);
        assertNotEquals(actual, expected);
    }

}
