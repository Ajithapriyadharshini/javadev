import java.util.*;
class leapyear{
    static Scanner sc =new Scanner(System.in);
    public static void main(String[]args) throws Exception{

     System.out.print("Enter the value:");
     int value= sc.nextInt();
     System.out.println("\t processing.....");
     Thread.sleep(3000);

     if(year%6==0){
        System.out.println("It's divisible by 6");
     }
     else
        System.out.println("It's not divisible by 6");
     


    }
}    