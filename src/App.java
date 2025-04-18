package src;

public class App{
    String username;
    float appVersion;

    public enum Operation {
        ADDITION {
            // Overriding the supertype method tells Java "Hey, now I'm using my own version from this provided method."
            @Override
            public int applyOperation(int num1, int num2) {
                return num1 + num2;
            }
        },
        MULTIPLICATION {
            // Using the Override annotation to help the compiler.
            @Override
            public int applyOperation(int num1, int num2) {
                return num1 * num2;
            }
        },
        SUBTRACTION {
            @Override
            public int applyOperation(int num1, int num2) {
                return num1 - num2;
            }
        },
        DIVISION {
            @Override
            public int applyOperation(int num1, int num2) {
                return num1 / num2;
            }
        };
        /* Providing the method and make it (abstract), to tell Java that each constant will define its own version of
        this method, here we're just saying "Hey, here is the method, and you define it with your own" */
        public abstract int applyOperation(int num1, int num2);
    }

    App (String name, float version) {
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
            // Choosing the correspondence Enum of the user input
            Operation chosenOperation = Operation.valueOf(operationType.toUpperCase());
            result =  chosenOperation.applyOperation(num1, num2);
        } catch (IllegalArgumentException exception) {
            System.out.println("Invalid operation type: " + operationType);
        }
        return result;
    }
}