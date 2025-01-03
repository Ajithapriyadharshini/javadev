import java.util.*;
class witch{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
      System.out.print("Enter the days :");
      int days=sc.nextInt();

      switch(days){
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednesday");
          break;
        case 4:
          System.out.println("thursday");
          break;
        case 5:
          System.out.println("friday");
          break;
        case 6:
          System.out.println("saturday");
          break;
        case 7:
          System.out.println("sunday");
          break;
      }
    }
    
}