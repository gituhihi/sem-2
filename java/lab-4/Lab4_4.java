import java.util.*;
public class Lab4_4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[5];
		int [] b = new int[5];

		for (int i=0;i<5 ;i++ ) {
			a[i]=sc.nextInt();
		}
		int k=0;
		for (int i=4;i>=0 ;i-- ) {
			b[k]=a[i];
			k++;
			System.out.println(b[k-1]);
		}

	}
}