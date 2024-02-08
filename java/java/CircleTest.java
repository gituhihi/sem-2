import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int length = inputString.length();
        if (length % 2 == 0) {
            int secondHalfStartIndex = length / 2;
            String secondHalf = inputString.substring(secondHalfStartIndex);
            System.out.println("Second half of the string: " + secondHalf);
        } else {
            // If the length is odd, print the second half starting from the middle character
            int middleIndex = length / 2;
            String secondHalf = inputString.substring(middleIndex);
            System.out.println("Second half of the string: " + secondHalf);
        }

        scanner.close();
    }
}
