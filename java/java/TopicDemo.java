class Circle {
    double ans;

    public void radius(double r) {
        ans = 3.14 * 2 * r;
        System.out.println("Radius: " + ans);
    }

    public void diameter(double r) {
        ans = 2 * r;  
        System.out.println("Diameter: " + ans);
    }
}
