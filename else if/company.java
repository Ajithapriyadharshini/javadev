import java.util.*;
class company{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the employees working hour :");
        double hour =sc.nextDouble();

        if(hour>1 && hour<4)
         System.out.println("worker is highly efficient");
        else if(hour<2 && hour<5)
         System.out.println("worker is ordered to improve speed");
        else if(hour>3 && hour<6)
         System.out.println("given training to improve speed");
        else if(hour>5)
         System.out.println("worker is ordered to leave the company");
        else
        System.out.println("invalid");


    }
}