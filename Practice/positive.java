import java.util.*;
class positive{

    static Scanner sc =new Scanner(System.in);
    public static void main(String[]args)throws Exception
    {

    System.out.println("Enter the number:");
    int number=sc.nextInt();
    System.out.println("\t processing.....");
    Thread.sleep(3000);
    

     if(number>0)
      {
        System.out.print("positive");
      }

     else{
       if(number<0)
      { 
        System.out.print("negative");   
      }
       if(number==0)
      { 
        System.out.print("neither positive nor negative");   
      }
    

    
   }
}
}