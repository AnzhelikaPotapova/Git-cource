public class Launcher {
    static void main(String[] args) {
        System.out.println("Изменены вводные данные, новый результат операций:");
        Calculator Calc = new Calculator();
        Calc.doOperation(15,4,((x, y) -> x+y));
        Calc.doOperation(10,6,((x, y) -> x-y));
        Calc.doOperation(11,4,((x, y) -> x*y));
        Calc.doOperation(8,2,((x, y) -> x/y));
    }
}
@FunctionalInterface
interface MathOperation {
    double operate (double x,double y);
}
