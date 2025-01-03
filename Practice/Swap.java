class Swap{
    public static void main(String[]args){
        int a=5,b=10, c=15;
        System.out.println("\t\t\tbefore swap");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
        System.out.println("c :"+c);
        a=a+b+c;
        b=a-(b+c);
        c=a-(b+c);
        a=a-(b+c);
        System.out.println("\t\t\tafter swap");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
        System.out.println("c :"+c);
    }
}