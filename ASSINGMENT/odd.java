import java.util.*;
class odd{

    static Scanner sc =new Scanner(System.in);
    public static void main(String[]args)throws Exception
    {

    System.out.println("Enter the number:");
    int number=sc.nextInt();
    System.out.println("\t processing.....");
    Thread.sleep(3000);
    

     if(number%2==0)
      {
        System.out.print("even");
      }

     else
        System.out.print("odd");   
      
    }
}