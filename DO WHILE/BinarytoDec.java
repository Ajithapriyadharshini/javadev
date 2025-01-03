class  BinarytoDec {
      public static void main(String[] args) {
        decimalToBinary();
        int binary=1101,x=1,sum=0;
        System.out.println(binary);
        while (binary>0) {
            sum+=(binary%10)*x;
            x*=2;
            binary/=10;
            
        }
        System.out.println(sum);
      }

      static void decimalToBinary(){
        int deci=13;
        String ans ="";
        while(deci>0){
            ans = deci%2+ans;
            deci/=2;
        }
        System.out.println(ans);


      }
    
       


    
}
