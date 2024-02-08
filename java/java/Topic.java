import java.util.*;

public class Topic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius for r");
        double r = sc.nextDouble();

        Circle circle = new Circle();
        circle.radius(r);

        System.out.println();
    }
}

class Circle {
    double ans;

    public void radius(double r) {
        ans = 3.14 * 2 * r;
        System.out.println("Radius: " + ans);
    }

    public void diameter(double r) {
        ans = 2 * r;  // Corrected formula for diameter
        System.out.println("Diameter: " + ans);
    }
}
