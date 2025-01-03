import java.util.*;
class vote{
    static Scanner sc =new Scanner(System.in);
    public static void main(String[]args) throws Exception{

     System.out.print("Enter the age:");
     int age= sc.nextInt();
     System.out.println("\t processing.....");
     Thread.sleep(3000);

     if(age>=18 )
        System.out.println("eligible ");
     
     else
      
      System.out.println("not eligible");


    }
}    