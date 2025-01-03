import java.util.*;
class sub{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the language mark :");
        int mark1=sc.nextInt();
        System.out.print("Enter the english mark :");
        int mark2=sc.nextInt();
        System.out.print("Enter the maths mark :");
        int mark3=sc.nextInt();
        System.out.print("Enter the physics mark :");
        int mark4=sc.nextInt();
        System.out.print("Enter the chemistry mark :");
        int mark5=sc.nextInt();
        System.out.print("Enter the percentage :");
        double percentage=(mark1+mark2+mark3+mark4+mark5)/5;
        
        if(percentage>=60)
        {
            System.out.println("percentage :"+percentage);
            System.out.println("First division");
        }
        else if(percentage>50 && percentage<59)
        {
            System.out.println("percentage :"+percentage);
            System.out.println(" second division");
        }
        else if(percentage>40 && percentage<49)
        {
            System.out.println("percentage :"+percentage);
            System.out.println(" third division");
        }
        else {
        System.out.println("fail");
        }
}
}