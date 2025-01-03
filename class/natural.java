import java.util.*;
class Naturalnumbers {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter natural number :");
        int num=sc.nextInt();
        int sum=0;

        for(int i=1; i<=num;i++){
            sum=sum+i;
        
        }
        System.out.println("sum:"+sum);
    }
     
}
