class  Ring {
   static int x = 10;
    public  void round() { 
        System.out.println(x);
    }
}

public class Static {
    public static void main(String[] args) {
        Ring r = new Ring(); 
        r.round(); 
    }
}
// variyable      method 
// static         static
// non static     non static 
// non static     static         not compile
// static         nonstatic