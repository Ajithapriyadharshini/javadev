import java.util.*;
class vowels{

    static Scanner sc =new Scanner(System.in);
    public static void main(String[]args)throws Exception
    {

    System.out.println("Enter the character:");
    char value=sc.next().charAt(0);
    System.out.println("\t processing.....");
    Thread.sleep(1000);
    

     if(value =='a' || value=='i' || value=='e' || value=='o' || value=='u')
      
        System.out.print("vowels");
     else{
        if(value =='A' || value=='E' || value=='I' || value=='O' || value=='U')
      
        System.out.print("vowels");
        else System.out.print("consonants"); 
     }

          
       
       
    }
}