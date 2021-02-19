import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void isThen_AddBetweenSixAndFour_Then() {
        // prerequisites
        Calculator addTwoNumber = new Calculator(6,4);
        //Actions
        int actualValue = addTwoNumber.getAdd();
        int expectedValue = 10;
        //Verification
        Assert.assertEquals(expectedValue, actualValue);
    }

}