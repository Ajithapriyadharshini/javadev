import java.util.*;
class alphabet{
    static Scanner sc =new Scanner(System.in);
    public static void main(String[]args) throws Exception{

     System.out.print("Enter the value:");
     char value= sc.next().charAt(0);
     System.out.println("\t processing.....");
     Thread.sleep(1000);
     
     if(value>='A'&& value<='Z')
      System.out.print("ALPHABETS");
     
     else
      System.out.print("others");

    }
}    