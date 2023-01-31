
public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        double result = a * b;
        return result;
    }
    public double div(double a, double b) {
        double result;
        if (b == 0)
        { System.out.println("անվեջություն"); result=0;}
          else   result = a / b;
          return result;
        }
}


