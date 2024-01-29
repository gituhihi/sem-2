public class Lab4_6 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: No command-line arguments provided.");
            System.exit(1); // Terminate the program with an error code
        }
        for (String arg : args) {
            // Check if the argument does not start with an uppercase letter
            if (!Character.isUpperCase(arg.charAt(0))) {
                System.out.println("Error: Argument \"" + arg + "\" does not start with an uppercase letter.");
                System.exit(1); // Terminate the program with an error code
            }
        }
        System.out.println("All command-line arguments start with an uppercase letter. Processing...");
    }
}
