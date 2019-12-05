package homework3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class DivTest extends AbstractBaseTest {

    @DataProvider(name = "divisionTestPositive")
    public Object[][] divisionPositiveTestDataProvider() {
        return new Object[][]{
                {15538464, 2589744, 6},
                {-81847584, -87444, 936},
                {253819902, 2589999, 98}
        };
    }

    @Test(dataProvider = "divisionTestPositive")
    public void positiveDataProviderDivisionTest(long a, long b, long expected) {
        long actual = calculator.div(a, b);
        assertEquals(actual, expected);
    }

    @DataProvider(name = "divisionTestNegative")
    public Object[][] divisionNegativeTestDataProvider() {
        return new Object[][]{
                {15538464, 2589744, 4789000},
                {-81847584, -87444, 57933300},
                {253819902, 2589999, 9989000}
        };
    }

    @Test(dataProvider = "divisionTestNegative")
    public void negativeDataProviderDivisionTest(long a, long b, long expected) {
        long actual = calculator.div(a, b);
        assertNotEquals(actual, expected);
    }


}
