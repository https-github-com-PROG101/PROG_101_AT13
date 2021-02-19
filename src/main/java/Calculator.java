public class Calculator {

    int numberOne;
    int numberTwo;

    public Calculator(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int getAdd(){
        return numberOne + numberTwo;
    }

    public int getSubstract(){
        return numberOne - numberTwo;
    }
}
