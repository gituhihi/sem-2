import java.util.*;

public class Attendance{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int firstRollno;
         System.out.println("Enter first roll no of the class : ");
         firstRollno = sc.nextInt();
         int[] absent = new int[200];
         int currRoll = firstRollno;
         int i=0;
         int y=0;
         while(i>=0){
           System.out.println("Enter 1 for present and 0 for absent for roll no "+currRoll+" : ");
           i=sc.nextInt();
           if (i==0) {
                absent[y] = currRoll;
                y++;
            } 
            currRoll++;
        }
        System.out.print("Absent roll numbers are : ");
        for (int j=0;j<y;j++) {
            if (j==y-1) {
               System.out.print(absent[j]);    
            }else{
               System.out.print(absent[j] + ","); 
            }
        }
    }
}