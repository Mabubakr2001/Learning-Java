package src;

public class App{
    String username;
    float appVersion;

    public enum Operation {
        ADDITION,
        MULTIPLICATION,
        SUBTRACTION,
        DIVISION
    }

    public App (String name, float version) {
        if (version < 0) {
            throw  new IllegalArgumentException("Version can't be negative though!");
        }
        username = name;
        appVersion = version;
    }

    public void greeting(String name) {
        System.out.println("Welcome to our app, " + name + "!");
    }

    public void countdown() {
        int timer = 20;
        while (timer > 0) {
            System.out.println("Running the app...");
            timer--;
        }
        System.out.println("Calculating...");
    }

    public int operating(int num1, int num2, String operationType) {
        int result = 0;
        try {
            Operation choosenOperation = Operation.valueOf(operationType.toUpperCase());
            switch (choosenOperation) {
                case ADDITION:
                    result = num1 + num2;
                    break;
                case MULTIPLICATION:
                    result = num1 * num2;
                    break;
                case SUBTRACTION:
                    result = num1 - num2;
                    break;
                case DIVISION:
                    result = num1 / num2;
                    break;
                default:
                    break;
            }
        } catch (IllegalArgumentException exception) {
            System.out.println("Invalid operation type: " + operationType);
        }
        return result;
    }
}