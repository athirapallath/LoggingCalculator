public class LoggingCalculator implements Calculator {
    Calculator calculator;

    public LoggingCalculator(Calculator calculator){
        this.calculator= calculator;
    }


    @Override
    public int add(int a, int b) {
       int result =calculator.add(a,b);
       System.out.println("Add a= "+a+" ,  b= "+b+", result= "+result);
       return result;
    }

    @Override
    public int multiply(int a, int b) {
        int result = calculator.multiply(a,b);
        System.out.println("Multiply a= "+a+" ,  b= "+b+", result= "+result);
        return result;
    }
}
