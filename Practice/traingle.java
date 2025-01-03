import java.util.*;
class traingle{
    static Scanner sc =new Scanner(System.in);
    public static void main(String[]args) throws Exception{

     System.out.print("Enter the 1st value:");
     int value1= sc.nextInt();
     System.out.print("Enter the 2nd value:");
     int value2= sc.nextInt();
     System.out.print("Enter the 3rd value:");
     int value3= sc.nextInt();
     System.out.println("\t processing.....");
     Thread.sleep(4000);

     if(value1==value2 && value1==value3 ){
        System.out.println("equilateral");
        
     }
     if(value1!=value2){
        System.out.println("Isosceles");
     }

    }

}