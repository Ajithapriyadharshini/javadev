import java.util.*;
class Min{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)throws Exception
    {
      System.out.println("Enter the value1 :");
      int value1 =sc.nextInt();
      System.out.println("Enter the value2 :");
      int value2 =sc.nextInt();
      
      System.out.println("\t\t\t processing.......");
      Thread.sleep(2000);
    
      if(value1<value2)
        System.out.println("it is smallest");

      else
        System.out.println("it is not smallest");
    
 }
}