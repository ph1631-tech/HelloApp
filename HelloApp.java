public class HelloApp {
    public static void main(String[] args) {
        // If no argument is passed, default to "World"
        String userName = (args.length > 0) ? args[0] : "World";
        System.out.println("Hello " + userName + "!");
    }
}