public class HelloApp {
    public static void main(String[] args) {
        // Ensure a name is passed as command-line argument
        if (args.length == 0) {
            System.out.println("Hello, please provide your name as a command-line argument.");
            return;
        }

        // Capture the first argument as the user's name
        String userName = args[0];
        System.out.println("Hello " + userName + "!");
    }
}