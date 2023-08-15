public class Main {
    public static void main(String[] args) {

        Calculator calculator = new SimpleCalculator();
        Calculator loggingCalculator = new LoggingCalculator(calculator);

        loggingCalculator.add(10,20);
        loggingCalculator.multiply(10,20);

        loggingCalculator.add(10,20);
        loggingCalculator.multiply(10,20);
    }
}