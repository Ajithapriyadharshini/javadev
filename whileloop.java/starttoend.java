import java.util.*;
class starttoend {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
    
        System.out.println("enter start");
        int start=sc.nextInt();
        System.out.println("enter end");
        int end=sc.nextInt();

        while (start<=end) {
            System.out.print(start);
            start++;
            
        }
    }
}
