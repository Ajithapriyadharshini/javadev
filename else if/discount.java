import java.util.*;
class dis{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the quantity :");
        int quantity=sc.nextInt();
        System.out.print("Enter the price :");
        double price =sc.nextDouble();
        
       if(quantity>100)
        {
          double rupees=(quantity*price)-(quantity * price*10/100);
          System.out.println("rupees :"+rupees);
        }
        else if(quantity<100)
        {
          double rupees=(quantity*price);
          System.out.println("rupees :"+rupees);
        } 
        else
        System.out.println("....");

    }

}