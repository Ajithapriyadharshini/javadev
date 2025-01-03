import java.util.*;
class max{

    static Scanner sc =new Scanner(System.in);
    public static void main(String[]args)throws Exception
    {

    System.out.println("Enter the number:");
    int number=sc.nextInt();
    System.out.println("\t processing.....");
    Thread.sleep(3000);
    

     if(number==0)
      {
        System.out.println("zero");
      }

     else{
       if(number%2!=0)
      { 
        System.out.println("odd");   
      }
       if(number%2==0)
      { 
        System.out.println("even");   
      }
    

    
   }
}
}