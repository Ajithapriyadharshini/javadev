import java.util.*;
class Ifelse{
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
    
      if(value1>value2 && value1>value3){
        if(value2>value3)System.out.println("Second maximum value is "+ value2);
        else System.out.println("Second maximum value is "+ value3);

      }

      else if(value2>value1 && value2>value3){
         if(value1>value3)System.out.println("Second maximum value is "+ value1);
        else System.out.println("Second maximum value is "+ value3);
      }
       else {
        
         if(value1>value2)System.out.println("Second maximum value is "+ value1);

        else System.out.println("Second maximum value is "+ value2);
  }
        

       
 }
}