import java.util.*;
class di{
    static Scanner sc =new Scanner(System.in);
    public static void main(String[]args) throws Exception{

     System.out.print("Enter the value:");
     int value= sc.nextInt();
     System.out.println("\t processing.....");
     Thread.sleep(3000);

     if(value%3==0 && value%9==0){
        System.out.println("It's divisible by 3 and 9");
     }
     else
      if(value%3==0){
        System.out.println("its divisible by any 3");
      }
        
     if(value%3!=0 && value%9!=0){
        System.out.println("not divisible by  3 and 9");
     }


    }
}    