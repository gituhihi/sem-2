// import java.util.*;
// public class atendence{
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter First Roll Nu");
// 		int firstRoll=sc.nextInt();
// 		int absentarr[]=new int[200];
// 		int totaabsent=0;
// 		int currentRoll=firstRoll;
// 		while(currentRoll>0){
// 		System.out.println("press 1 for present and 0 absent");
// 		int temp=sc.nextInt();
// if(temp==0){
// 	absent[totaabsent]=currentRoll;
// }
// else if(temp<0){
// currentRoll=temp;
// }
// for(int i=0;i<totaabsent;i++){
// 		System.out.println("totaabsent[i]+");



// }
// 		}	
// 	}
// }

import java.util.*;

public class Attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Roll Nu");
        int firstRoll = sc.nextInt();
        int absentarr[] = new int[200];
        int totaabsent = 0;
        int currentRoll = firstRoll;

        while (currentRoll > 0) {
            System.out.println("press 1 for present and 0 for absent");
            int temp = sc.nextInt();
            if (temp == 0) {
                absentarr[totaabsent] = currentRoll;
                totaabsent++;
            } else if (temp < 0) {
                currentRoll = temp;
            }

            for (int i = 0; i < totaabsent; i++) {
                System.out.println(absentarr[i]);
            }
        }
    }
}
