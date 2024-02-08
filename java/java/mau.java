// import java.util.*;
// public class mau {
//     public static void main(String[] args) {
// 		StringBuilder sb= new StringBuilder("maulik");
// 		System.out.println(sb);
// 		sb.setcharAt(3 ,'A');
// 		System.out.println(sb);

//     }
// }
    	
import java.util.*;
public class mau {
    public static void main(String[] args) {
    	       StringBuilder sb = new StringBuilder("maulik");
        System.out.println(sb);
 for(int i=0;i<sb.lenth()/2;i++)    {
int front =i;
int back = sb.lenth()-1-i;
char frontChar = sb.cahrAt(front);
char backChar = sb.cahrAt(back);
sb.setcharAt(front,backchar);
sb.setcharAt(back,frontchar);
        
		}
		System.out.println(sb);
	}
}
