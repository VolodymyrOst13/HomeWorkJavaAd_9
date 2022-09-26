package task4;

public class Main {
    public static Double calculate(Double op1, Double op2, DoubleOperator operator) {
        return operator.apply(op1, op2);
    }
}

@FunctionalInterface
interface DoubleOperator {
    public Double apply(Double a, Double b);
}
class Main1{
    public static void main(String[] args) {

        Double result1 = Main.calculate(30d, 70d, (a, b) -> a + b);
        System.out.println(result1);

        Double result2 = Main.calculate(100d, 50d, (a, b) -> a - b);
        System.out.println(result2);

        Double result3 = Main.calculate(5d, 5d, (a, b) -> a * b);
        System.out.println(result3);

        Double result4 = Main.calculate(20d, 10d, (a, b) -> a / b);
        System.out.println(result4);

        Double result5 = Main.calculate(20d, 10d, (a, b) -> a > b ? b : a);
        System.out.println(result5);
    }
}
