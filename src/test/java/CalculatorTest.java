import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void getAdd_AddBetweenSixAndFour_Then() {
        // prerequisites
        Calculator addTwoNumber = new Calculator(6,4);
        //Actions
        int actualValue = addTwoNumber.getAdd();
        int expectedValue = 10;
        //Verification
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getSubstract_SubstractBetweenThenAndFive_Five() {
        // prerequisites
        Calculator substractTwoNumber = new Calculator(10,5);
        //Actions
        int actualValue = substractTwoNumber.getSubstract();
        int expectedValue = 5;
        //Verification
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getSquareRoot_SquareRootOfFour_Two() {
        // prerequisites
        Calculator squareRootOfOneNumber = new Calculator(4);
        //Actions
        double actualValue = squareRootOfOneNumber.getSquareRoot();
        double expectedValue = 2.0;
        //Verification
        Assert.assertEquals(expectedValue,actualValue,0.0);
    }
}