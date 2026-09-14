public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.plus(4, 5);
        calculator.printResult();

        calculator.minus(4, 5);
        calculator.printResult();

        calculator.divide(4, 5);
        calculator.printResult();

        calculator.multiple(4, 5);
        calculator.printResult();
    }
}
