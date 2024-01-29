import java.util.*;
public class Lab4_3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[5];
		float avg=0;
		for (int i=0;i<5 ;i++ ) {
			a[i]= sc.nextInt();
			avg=avg+a[i];
		}
		float ans=avg/4;
		System.out.println(ans);
	}
}