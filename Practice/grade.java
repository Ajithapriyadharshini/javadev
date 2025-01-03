import java.util.*;
class grade{
    static Scanner sc =new Scanner(System.in);
    public static void main(String[]args) throws Exception
    {
        System.out.print("Enter the percentage:");
        double percentage= sc.nextDouble();
        System.out.println("\t processing.....");
        Thread.sleep(1000);

        if(percentage>=70 && percentage<=100){
            System.out.println("distinction");
        }
        else if(percentage>=60 && percentage<70){
            System.out.println("first class");
        }
         else if(percentage>=50 && percentage<=60){
            System.out.println("second class");
        }
        else if(percentage>=35 && percentage<=50 ){
            System.out.println("pass");
        }
         else if(percentage<35 && percentage>0){
            System.out.println("fail");
        }
        else
            System.out.println("INVALID");
        }






    }   
