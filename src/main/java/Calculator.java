import java.text.DecimalFormat;

public class Calculator {

    int numberOne;
    int numberTwo;
    double number;

    public Calculator(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public Calculator(double number) {
        this.number = number;
    }

    public int getAdd(){
        return numberOne + numberTwo;
    }

    public int getSubstract(){
        return numberOne - numberTwo;
    }

    public double getSquareRoot(){
        return 0.0;
    }
}
