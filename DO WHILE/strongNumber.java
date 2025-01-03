import java.util.*;
public class strongNumber {
     static Scanner sc=new Scanner(System.in);
     public static void main(String[] args) {
        System.out.println("enter value:");
        int value=sc.nextInt();
        int temp=value, sum=0;

        while (value>0) {
            int lastdigit=value%10;
            int factorial=1;
         for(int i=2; i<=lastdigit; i++);
         {
            factorial *= i;
         }
            sum +=factorial; //sum = sum + factorial
            value /=10; // value = value /10
        }
         if (temp==sum) {
            System.out.print(temp+"given number is strong number ");
            
         }
         else{
            System.out.print(temp+"given number is not strong number");
         }

    }
}
