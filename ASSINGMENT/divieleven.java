import java.util.*;
class divieleven{
    static Scanner sc =new Scanner(System.in);
    public static void main(String[]args) throws Exception{

     System.out.print("Enter the value:");
     int value= sc.nextInt();
     System.out.println("\t processing.....");
     Thread.sleep(3000);

     if(value%11==0 )
        System.out.println("It's divisible by 11 ");
     
     else
      
        System.out.println(" it is not divisible by 11");
     


    }
}    