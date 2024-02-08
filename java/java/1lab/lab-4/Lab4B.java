import java.util.*;
public class Lab4B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter only one character not string: ");
        String name = sc.next();

        if (name.equals("a") || name.equals("e") || name.equals("i") || name.equals("o") || name.equals("u")) {
            System.out.println("Vowel");
        } else {
            System.out.println("Not a vowel");
        }
    }
}