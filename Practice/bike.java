import java.util.*;

class bike{
    static Scanner sc=new Scanner(System.in);
        public static void main( String[]args)throws Exception{

        System.out.print("Enter bike Name:");
        String bikename=sc.next();
         
        System.out.print("Enter bike color:");
        String bikeclr=sc.next();

        System.out.print("Enter bike price :");
        double mrp=sc.nextDouble();

        System.out.println("\t\t\tprocessing");
        Thread.sleep(2000);

        System.out.println("Enter bike Name:"+bikename);
        System.out.println("Enter bike colour :"+bikeclr);
        System.out.println("Enter bike price :"+mrp);
        
 }
}
