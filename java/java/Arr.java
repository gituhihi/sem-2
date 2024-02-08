import java.util.*;
public class Arr 
{
    public static void main(String[] args) 
    {
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int number[] =new int[size];
        // for(int i=0;i<size;i++)
        // {
        //     number[i]=sc.nextInt();
        // }
        //     int x = sc.nextInt();
        // for(int i=0;i < number.length;i++)
        // {
        //   if(number[i]==x){
        //     System.out.println("X found at" +i);
        //   }
        // }
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int number[][] =new int[row][col];

        for(int i=0;i<row;i++){
        for(int j=0;i<col;j++){
            number[i][j]=sc.nextInt();

            }
        }
                 for(int i=0;i<row;i++){
        for(int j=0;i<col;j++){
            System.out.println(number[i][j] + " ");
}
            System.out.println();

        }

    }
}


