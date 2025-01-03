import java.util.*;
class threedigit{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)throws Exception
    {
      System.out.print("Enter the value1 :");
      int value1 =sc.nextInt();
      System.out.print("Enter the value2 :");
      int value2 =sc.nextInt();
      System.out.print("Enter the value3 :");
      int value3 =sc.nextInt();
      
      System.out.println("\t\t\t processing.......");
      Thread.sleep(2000);
    
      if(value1<value2 && value1<value3)
        System.out.println("value1 is smallest");

      else

        if(value2<value1 && value2<value3)
        System.out.println("value2 smallest :");

        System.out.println("value3 is samllest");
 }
}