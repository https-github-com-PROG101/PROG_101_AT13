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

    @Test
    public void isFive_SubstractBetweenThenAndFive_Five() {
        // prerequisites
        Calculator substractTwoNumber = new Calculator(10,5);
        //Actions
        int actualValue = substractTwoNumber.getSubstract();
        int expectedValue = 5;
        //Verification
        Assert.assertEquals(expectedValue, actualValue);
    }
}