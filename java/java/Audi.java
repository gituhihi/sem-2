import java.util.Scanner;
// public class StudentDivision {
//     public static void main(String[] args) {
//         // Create a Scanner object to take input from the keyboard
//         Scanner scanner = new Scanner(System.in);

//         // Array to store marks for 5 subjects
//         int[] subjectMarks = new int[5];

//         // Input marks for each subject
//         for (int i = 0; i < 5; i++) {
//             System.out.print("Enter marks for Subject " + (i + 1) + ": ");
//             // Read the input and store it in the array
//             subjectMarks[i] = scanner.nextInt();
//         }

//         // Close the Scanner to prevent resource leak
//         scanner.close();

//         // Calculate the total marks and percentage
//         int totalMarks = 0;
//         for (int i = 0; i < 5; i++) {
//             totalMarks += subjectM{arks[i];
//         }
//         double percentage = (double) totalMarks / 5;

//         // Determine the division based on the percentage
//         String division;
//         if (percentage >= 60) {
//             division = "First Division";
//         } else if (percentage >= 50 && percentage <= 59) {
//             division = "Second Division";
//         } else if (percentage >= 40 && percentage <= 49) {
//             division = "Third Division";
//         } else {
//             division = "Fail";
//         }
//         System.out.println("\nTotal Marks: " + totalMarks);
//         System.out.println("Percentage: " + percentage + "%");
//         System.out.println("Division: " + division);
//     }
// }
// public class Audi{
//     public static void main(String[] args) {
//         double ans=Math.random();
//         System.out.println(ans);
//     }
// }
public class Audi{
    public static void main(String[] args) {
        double ans=Math.ceil((Math.random()*65)+301);
        System.out.println(ans);
    }
}