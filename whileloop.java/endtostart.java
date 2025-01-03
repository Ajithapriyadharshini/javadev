import java.util.*;
class endtostart{
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args)throws Exception {
        charecter();

    
        // System.out.print("enter start");
        // int start=sc.nextInt();
        // System.out.print("enter end");
        // int end=sc.nextInt();

        // while (start<=end) {
        //     System.out.print(start);
        //     start++;
        //     Thread.sleep(1000);
        //     System.out.print("\r");
            
        // }
        // System.err.println();
    }

    static void charecter()throws Exception{
        char ch = 'A';
        char  ch2= 'Z';

        while(ch<=ch2){
           
            System.out.print(ch);
            ch++;
            Thread.sleep(1000);
            System.out.print("\r");
            
        }
        System.out.println();

    }
}