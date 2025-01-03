import java.util.*;
class percent{
    static Scanner sc =new Scanner(System.in);
    public static void main(String[]args) throws Exception
    {
        System.out.print("Enter the percentage:");
        double percentage= sc.nextDouble();
        System.out.println("\t processing.....");
        Thread.sleep(4000);

        if(percentage>=90 && percentage<=100){
            System.out.println("GRADE A");
        }
        if(percentage>=80 && percentage<90){
            System.out.println("GRADE B");
        }
        if(percentage>=70 && percentage<80){
            System.out.println("GRADE C");
        }
        if(percentage>=60 && percentage<70){
            System.out.println("GRADE D");
        }
        if(percentage>=40 && percentage<60){
            System.out.println("GRADE E");
        }
        if(percentage<40){
            System.out.println("GRADE F");
        }
        if(percentage>100 || percentage<0)
            System.out.println("INVALID");
        }






    }   
