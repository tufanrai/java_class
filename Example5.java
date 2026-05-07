
import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter any number");
            int number = scanner.nextInt();

            if (number > 0) {
                System.out.print("The entered number is greater than 0");
            } else if (number < 0) {
                System.out.print("The number is less than 0");
            } else {
                System.out.print("The number is 0");
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
