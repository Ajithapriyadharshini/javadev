import java.util.*;
class ternary{
     static Scanner sc=new Scanner(System.in);
     public static void main(String[]args){
        
        System.out.print("Enter the number:");
        int number=sc.nextInt();

        String res=(number %2==0)?"even":"odd";
        System.out.println(res);
    }
}