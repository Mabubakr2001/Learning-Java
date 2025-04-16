public class App{
    String username;
    float appVersion;
    public App (String name, float version) {
        if (version < 0) {
            throw  new IllegalArgumentException("Version can't be negative!");
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
        int result;
        switch (operationType) {
            case "Addition":
                result = num1 + num2;
                break;
            case "Multiplication":
                result = num1 * num2;
                break;
            case "Subtraction":
                result = num1 - num2;
                break;
            default:
                result = num1 / num2;
                break;
        }
        return result;
    }
}