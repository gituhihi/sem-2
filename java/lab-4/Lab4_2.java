

import java.util.*;

public class Lab4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int v=0,c=0;
		for(int i=0;i<name.length();i++){
		if((name.charAt(i)=='a')||(name.charAt(i)=='e')||(name.charAt(i)=='i')||(name.charAt(i)=='o')||(name.charAt(i)=='u'))
		{	
			v=v+1;
		}
		else if(name.charAt(i)==' '){}
		else{
			c+=1;
		}
					
				}	
		System.out.println("not vovel"+c);
		System.out.println("There is"+v+"vovel");

}
}