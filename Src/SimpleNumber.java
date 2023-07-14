public class SimpleNumber {
    private int simpleNumber;
    private int currentNumber;

    public SimpleNumber(int simpleNumber, int currentNumber) {
        this.simpleNumber = simpleNumber;
        this.currentNumber = currentNumber;
    }

    public int getSimpleNumber() {
        return simpleNumber;
    }

    public void setSimpleNumber(int simpleNumber) {
        this.simpleNumber = simpleNumber;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        this.currentNumber = currentNumber;
    }

    @Override
    public String toString() {
        return "SimpleNumber{" +
                "simpleNumber=" + simpleNumber +
                ", currentNumber=" + currentNumber +
                '}';
    }
}
