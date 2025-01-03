import java.util.*;
class week{

    static Scanner sc =new Scanner(System.in);
    public static void main(String[]args)throws Exception
    {

    System.out.print("Enter the day:");
    int number=sc.nextInt();
    System.out.println("\t processing.....");
    Thread.sleep(3000);
    

     if(number>=1 && number<=7)
     
      {
        if(number==1)System.out.print("sunday");
        if(number==2)System.out.print("monday");
        if(number==3)System.out.print("tuesday");
        if(number==4)System.out.print("wednesday");

        if(number==5)System.out.print("thursday");
        if(number==6)System.out.print("friday");
        if(number==7)System.out.print("saturday");
      }

     else
        System.out.print("invalid");   
      
    }
}