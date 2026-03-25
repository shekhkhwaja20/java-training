// public class natural {
//     public static void main(String[] args) {
//          int sum=0;
//         for(int i=1;i<=10;i++)
//         {
//             sum=sum+i;
//         }
//         System.out.println(sum);
//     }
    
// }

import java.util.Scanner;

public class khwaja{
    public static void main(String[] args) {
        System.out.println("Enter the value of n=");
       Scanner sc=new Scanner(System.in);
       int sum=0;
       int n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
            sum=sum+i;
       }
       System.out.println("The value of the sum ="+sum);
    }
}