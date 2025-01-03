import java.util.*;

class employee{
    static Scanner sc=new Scanner(System.in);
        public static void main( String[]args)throws Exception{

        System.out.print("Enter your empname:");
        String empname=sc.next();
         
        System.out.print("Enter emp sal:");
        double sal=sc.nextDouble();

        System.out.print("enter your empid:");
        int empid=sc.nextInt();

        System.out.print("enter your contact :");
        long contact=sc.nextLong();

        System.out.println("\t\t\tprocessing");
        Thread.sleep(2000);

        System.out.println("Enter your empname:"+empname);
        System.out.println("Enter your empid :"+empid);
        System.out.println("Enter employee salary :"+sal);
        System.out.println("Enter your contact :"+contact);
 }
}
