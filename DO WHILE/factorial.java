import java.util.*;
class factorial{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args){
        System.out.print("enter the number :");
        int num=sc.nextInt();
        int fact=1;

        for(int i=2 ; i<=num ; i++){
            fact = fact*i;
        }
        System.out.print("factorial is :"+fact);
    }
}