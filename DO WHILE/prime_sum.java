public class prime_sum {
    public static void main(String[] args) {
        String prime_num ="";
        int prime_sum =0,num=10;
        for(int i=2;i<=num ; i++)
        {
            boolean prime = true;
            for(int j = 2; j<i; j++)
            {
                if(i%j==0){
                    prime=false;
                }

            }
            if(prime){
                prime_num = prime_num +" "+ i ;
                prime_sum += i;
            }

            
        }
        System.out.println("Prime NUmbers : "+prime_num);
        System.out.println("Prime Number Summation :"+prime_sum);
    }
}
