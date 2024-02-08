import java.util.*;
public class AreaCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a calculation (1-4):");
        System.out.println("1. a1 = 10 + (20 * 30)");
        System.out.println("2. a2 = (100 / 10) * 100");
        System.out.println("3. a3 = ((5 * 4) / 4) % 3");
        System.out.println("4. a4 = 100 + (200 / 10) - (3 * 10)");
        int choice = scanner.nextInt();
        double result = 0.0;
        switch (choice) {
            case 1:
                result = 10 + (20 * 30);
                break;
            case 2:
                result = (100 / 10) * 100;
                break;
            case 3:
                result = ((5 * 4) / 4) % 3;
                break;
            case 4:
                result = 100 + (200 / 10) - (3 * 10);
                break;
            default:
                System.out.println("Invalid choice");
                return;  
        }
        System.out.println("Result: " + result);
       scanner.close();
    }
}
