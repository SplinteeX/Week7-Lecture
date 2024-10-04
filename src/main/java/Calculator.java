public class Calculator {
    // Constructor
    Calculator() {}

    public static void main(String[] args) {
        Calculator test = new Calculator();  // Create an instance of Calculator
        test.run(10, 20);            // Call the run method with predefined numbers
    }

    // Method to perform addition with numbers passed as arguments
    public void run(int num1, int num2) {
        int sum = addNumbers(num1, num2);
        System.out.println("Here is the sum: " + sum);
    }

    // Non-static method to add numbers
    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
}