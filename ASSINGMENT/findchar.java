import java.util.*;
class alphabet1{
    static Scanner sc =new Scanner(System.in);
    public static void main(String[]args) throws Exception{
        

     System.out.print("Enter the charecter:");
     char value= sc.next().charAt(0);
     System.out.println("\t processing.....");
     Thread.sleep(1000);
     
     if(value>='A'&& value<='Z')
      System.out.print("Uppercase");
     else if(value>='a'&& value<='z')
      System.out.print("Lowercase");
     else if(value>='1'&& value<='9')
      System.out.print("Number");
     else
      System.out.print("Special characters");
    
     
    

    }
}  