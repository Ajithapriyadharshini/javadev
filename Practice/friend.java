import java.util.*;

class friend{
    static Scanner sc=new Scanner(System.in);
        public static void main( String[]args)throws Exception{

        System.out.print("Enter your friendname:");
        String Name=sc.next();
         
        System.out.print("Enter Friend Age:");
        int Age =sc.nextInt();

        System.out.print("Enter Friend contact  :");
        long contact=sc.nextLong();

        System.out.println("\t\t\tprocessing");
        Thread.sleep(3000);

         System.out.println("Enter your friendname:"+Name);
         System.out.println("Enter Friend Age:"+Age);
         System.out.println("Enter Friend contact  :"+contact);
        
 }
}
