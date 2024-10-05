import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        

       
        double num1 =10;

        double num2 = 8;

        // Input the operation
        System.out.print("Choose operation (+, -, *, /): ");
        char operator = '+';

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        // Output the result
        System.out.println("The result is: " + result);
    }
}
