class OddEven {
    public static void main(String[] args) {
        int a = 1;

        while (a<=100) {
            if (a%3==0 || a%9==0) {
                System.out.print(" "+a); 
                
            }
            a++;   
        }
       
    }
    
}
