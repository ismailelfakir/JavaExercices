public class Calculator {
    int operand1;
    int operand2;

    public int add() {
        return operand1 + operand2;
    }

    public int subtract() {
        return operand1 - operand2;
    }

    public int multiply() {
        return operand1 * operand2;
    }

    public double divide() {
        if (operand2 == 0) {
            System.out.println("Error: Division by zero..!");
            return 0;
        }
        return (double) operand1 / operand2;
    }
}
