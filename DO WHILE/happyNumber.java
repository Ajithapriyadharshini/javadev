import java.util.*;
class happyNumber {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
         System.out.println("enter num :");
         int num=sc.nextInt();
         int sum=0;

         while (num!=1 && num!=4) {
           
           while (num>0) {
                int lastdigit=num%10;
                sum=sum+lastdigit*lastdigit;
                num=/10;

           }
   
         
         }
    }
}
