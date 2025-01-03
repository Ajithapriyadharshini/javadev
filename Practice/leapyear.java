import java.util.*;
class leapyear{
    static Scanner sc =new Scanner(System.in);
    public static void main(String[]args) throws Exception{

     System.out.print("Enter the year:");
     int year= sc.nextInt();
     System.out.println("\t processing.....");
     Thread.sleep(3000);

     if(year%4==0){
        System.out.println("It's leapyear");
     }
     if(year%4!=0){
        System.out.println("It's not a leapyear");
     }


    }
}    