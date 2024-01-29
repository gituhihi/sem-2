// public class Lab4_7 {
//     public static void main(String[] args) {
//         int n = 3; // Adjust the value of n to control the size of the pattern

//         // Print the upper part of the pattern
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//         Print the lower part of the pattern
//         for (int i = n - 1; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//   }
// }

public class Lab4_7 {
    public static void main(String[] args) {
        String word = "stream";

        for (int i = 1; i <= word.length(); i++) {
            String substring = word.substring(0, i);
            System.out.println(substring);
        }
    }
}
