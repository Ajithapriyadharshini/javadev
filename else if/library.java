import java.util.*;
class library{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args){

        System.out.print(" Enter the return day :");
        int returnday=sc.nextInt();
        
        if( returnday>0)
        {
          if(returnday<=5){
           double fine = (returnday*0.50);
           System.out.print("fine amount is :"+ fine);   
          } 
          else if(returnday>5 && returnday<=10){
           double fine2 = (5*0.50)+(returnday-5*1);
           System.out.print("fine amount is :"+ fine2);   
          } 
          else if( returnday>=10){
           double fine3 = (5*0.50)+(5*1)+(returnday-10*1);
           System.out.print("fine amount is :"+ fine3);   
          } 
          else if(returnday>30){
          System.out.print("membership is cancelled");   
          }
          else{
            System.out.println("something else");
          }      
        }else
        {
            System.out.println("something else");
        }
    }

    
}