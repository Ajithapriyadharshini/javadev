import java.util.*;
class mobie{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
      System.out.println("Select the input:");
      System.out.println("1.PUSHPA\n2.VIKRAM\n3.LEO");
      System.out.print("Enter the input");
       int Movie=sc.nextInt();

      switch(Movie){
        case 1:
          System.out.println("Select input");
          System.out.println("1.ALLU ARJUN");
          System.out.println("2.RASHMIKA");
          System.out.print("Enter the input");
          int hero = sc.nextInt();
          switch(hero){
            case 1: System.out.println("ALLU ARJUN age is 34");
            break;
            case 2: System.out.println("RASHMIKA age is 26");
            break;
            }
            break;

        case 2:
          System.out.println("Select input");
          System.out.println("1.kamal hasan");
          System.out.println("2.vijay sethupathy");
          System.out.print("Enter the input");
          int hero2= sc.nextInt();
          switch(hero2){
            case 1: System.out.println("kamalhasan age is 64");
            break;
            case 2: System.out.println("vijay sethupathy age is 40");
            break;
          }
          break;
        
        case 3:
          System.out.println("Select input");
          System.out.println("1.thalapathi");
          System.out.println("2.thirisha");
          System.out.print("Enter the input");
          int actor = sc.nextInt();
          switch(actor){
            case 1: System.out.println("thalapathi age is 54");
            break;
            case 2: System.out.println("thirsha  age is 30");
            break;
          }
           break;
          default:
            System.out.println("invalid");
      
 }
}
}