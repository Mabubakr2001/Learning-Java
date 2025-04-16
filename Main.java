import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        App myApp = new App("Calculation App", 1.0f);
        // Scanning all the system inputs that come from the user.
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username: ");
        myApp.greeting(myObj.nextLine());
        int num1;
        int num2;
        try {
            System.out.println("Enter the first number: ");
            num1 = Integer.parseInt(myObj.nextLine());
            System.out.println("Enter the second number: ");
            num2 = Integer.parseInt(myObj.nextLine());
            // instantiates the number format exeption error object and throw it.
        } catch (NumberFormatException exception) {
            System.out.println("Invalid number input! " + exception.getMessage());
            return;
        }
        System.out.println("Enter the operation type: ");
        String operationType = myObj.nextLine();
        myApp.countdown();
        int result = myApp.operating(num1, num2, operationType);
        System.out.println("The result is: " + result);
        // Stopping the scanner to clean the system resources.
        myObj.close();
    }
}