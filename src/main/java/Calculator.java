import java.util.Scanner;

public class Calculator {
    // Constructor
    Calculator() {}

    public static void main(String[] args) {
        Calculator test = new Calculator();  // Create an instance of Test
        test.run();              // Call the run method
    }

    // Method to handle input and perform addition
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        int sum = addNumbers(num1, num2);
        System.out.println("Here is the sum: " + sum);
    }

    // Non-static method to add numbers
    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
}