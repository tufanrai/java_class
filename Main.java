
import java.util.Scanner;

// public accessibility of the class
// class
// Main (name of class)
public class Main {

    public static void main(String[] arg) {
        try (Scanner scanner = new Scanner(System.in)) {
            /*
            Primitive Datatypes 
            -------------------
            -------------------
            1. Boolean (default value: false)
            2. Character (default value: /u000000)
            3. byte (default value: 0) Small integer can hold up to 1byte
            4. short (default value: 0) Little greater integer can hold up to 2byte
            5. int (default value: 0) Larger than short, can hold up to 4byte
            6. long (default value: 0) Larger than int, can hold up to 8byte
            7. float (deafult value: 0f) Floating point number, can hold up to 4byte
            8. double (default value: 0d) Larger than floating point number, can hold up to 8byte

            ------------------
            ------------------
            Selecting the perfect datatype is the best way to save your memory and make your code faster.
            ------------------
            ------------------
            NOTE:-
            Whenever you declare a variable with float datatype, by default it assums itself as a double. 
            Thus, we do have to mention f at the end to identify as a double.
             */

            // WAP to find the greatest number between three numbers.
            byte num1 = 12;
            byte num2 = 24;
            byte num3 = 23;

            if (num1 > num2 && num1 > num3) {
                System.out.println("The greates number is " + num1);
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("The greates number is " + num2);
            } else {
                System.out.println("The greates number is " + num3);
            }

            // WAP to take user's name and age and display them as an output. 
            System.out.println("Enter your name");
            String name = scanner.nextLine();
            System.out.println("Enter your age");
            byte age = scanner.nextByte();

            scanner.close();

            System.out.println("Your name is " + name + " and you are " + age + " years old.");

            /*
            Naming Convention
            -----------------
            -----------------
            1. Pascal Case - FirstName, LastName, (used to name the class)
            2. Camel Case - firstName, lastName, (used by methods in java)
            3. Snake Case - first_name, last_name,

            -----------------
            -----------------
            Operator in Java
            -----------------
            Symbols used to perform operation.

            Types of operator

            1. Arithmetic Operator
            2. Logical Operator
            3. Assignment Operator
            4. Unary Operator (increment/decrement)
            6. Relational (Comparison) Operator
            7. Bitwise Operator (&, |, ~)
            8. Conditional (Ternary) Operator ( condition? true vlaue : false value)
            9. Instance of Operator
            
            -----------------
            -----------------
            Program
            -----------------

            1. Data Representation
            2. Input
            3. Algorithm (Formula)
            4. Output

            -----------------
            to print entire line of string use nextLine()
            to take only one word use next()
             */
            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
