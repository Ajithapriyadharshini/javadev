import java.util.*;
class palindrome {
      static Scanner sc=new Scanner(System.in);
      public static void main(String[] args) {
         System.out.println("Enter number :");
         int num=sc.nextInt();
         int rev =0, temp=num;
         
         while(num>0){
           rev=rev*10 +num%10;
           num = num/10; 
         } 
         if(rev==temp)
         System.out.println("palindrome");
         else
            System.out.println("not a palindrome");
         
    
}
}