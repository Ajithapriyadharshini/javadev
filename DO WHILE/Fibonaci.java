public class Fibonaci {
    public static void main(String[] args) {
        int n1=0, n2=1, series=20;
        System.out.print(n1+" "+n2+" ");
        for(int i= 0; i<=series-2; i++)
        {
            int n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}
