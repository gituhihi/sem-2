import java.util.*;
public class Calculater{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("+,-,*,/");
		char s = sc.next().charAt(0);
		int a = sc.nextInt();	
		int b = sc.nextInt();	
		if (s=='+') {
			System.out.println(a+b);
		}
		if (s=='-') {
			System.out.println(a-b);
		}
		if (s=='*') {
			System.out.println(a*b);
		}
		if (s=='/') {
				while(b==0)
{
	System.out.print("Enter valid number");
b=sc.nextInt();
}
System.out.println(a/b);
		}

	}
}