import java.util.*;
class cons{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
      System.out.print("Enter the alphabets :");
      char alphabets=sc.next().charAt(0);

      switch(alphabets){
        case 'a' :
          System.out.println("vowels");
          break;
        case 'e' :
          System.out.println("vowels");
          break;
        case 'i':
          System.out.println("vowels");
          break;
        case 'o':
          System.out.println("vowels");
          break;
        case 'u':
          System.out.println("vowels");
          break;
        default :
          System.out.println("consonants");
          break;
      }
    }
    
}