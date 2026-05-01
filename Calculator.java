
import java.util.Scanner;

public class Calculator {

    public static void main(String[] arg) {
        try (Scanner scanner = new Scanner(System.in)) {
            String operand;
            byte x;
            byte y;

            byte response;

            System.out.print("Enter first number: ");
            x = scanner.nextByte();

            System.out.print("Enter second number: ");
            y = scanner.nextByte();

            System.out.print("Enter operation that you want to perform on entered number: ");
            operand = scanner.next();

            response = switch (operand) {
                case "+" ->
                    (byte) (x + y);
                case "-" ->
                    (byte) (x - y);
                case "*" ->
                    (byte) (x * y);
                case "/" ->
                    (byte) (x / y);
                case "%" ->
                    (byte) (x % y);
                default ->
                    (byte) 0;
            };

            System.out.println(x + operand + y + " = " + response);
            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
