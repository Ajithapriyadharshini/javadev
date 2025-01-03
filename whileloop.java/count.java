import java.util.*;
class count {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {       
       
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int count=0;
        
        while (number>0) {
             number=number/10;
            count ++;
        }
        System.out.println("total digits :"+count);
    }
}
