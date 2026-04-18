public class Launcher {
    static void main(String[] args) {
        Calculator Calc = new Calculator();
        Calc.doOperation(10,4,((x, y) -> x+y));
        Calc.doOperation(10,4,((x, y) -> x-y));
        Calc.doOperation(10,4,((x, y) -> x*y));
        Calc.doOperation(10,4,((x, y) -> x/y));

    }
}
@FunctionalInterface
interface MathOperation {
    double operate (double x,double y);
}
