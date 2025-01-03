import java.util.*;
class eb{

    static Scanner sc =new Scanner(System.in);
    public static void main(String[]args)throws Exception
    {

    System.out.println("Enter the unit:");
    int unit=sc.nextInt();
    System.out.println("\t processing.....");
    Thread.sleep(1000);
    
    if(unit>0 && unit<=50)
    {
        double price= (unit*0.5)+(unit*0.5*20/100);
       System.out.println("price :"+ price);//0.5 per unit  50 * 0.50 , 150 
    }
    else if(unit>50 && unit<=150)
    {

       double price= (unit*0.75)+(unit*0.75*20/100);
       System.out.println("price :"+ price);//0.75 per unit 
    }
    else if(unit>150 && unit<=250)
    {
       double price= (unit*1.20)+(unit*1.20*20/100);
       System.out.println("price :"+ price);//1.20 per unit 
    }
    else if(unit>250 )
    {
       double price= (unit*1.50)+(unit*1.50*20/100);
       System.out.println("price :"+ price);//1.50per unit 
    }
    

    }
}