import java.util.*;
class swiggy {
    static Scanner sc= new Scanner(System.in);
    static Random rend=new Random();
    public static void main(String[] args)throws Exception{
        System.out.println("Select the hotel");
        System.out.println("Are you hungerrr.........");
        System.out.println("1.bhuhari\n2.billal\n3.Amma canteen\n4.A2B");
        System.out.println("enter the input :");
        int hotel=sc.nextInt();

        switch (hotel) {
            case 1:
              System.out.println("\t\t\t WELCOME TO BHUHARI .....");
              System.out.println("chicken biriyani - 120");
              System.out.println("mutton biriyani  -220 ");
              System.out.println("chicken 65       -80");
              System.out.println("prawn biriyani   -300");
              System.out.println("select the food");
              int food=sc.nextInt();
              double food1=120;
              double food2=220;
              double food3=80;
              double food4=300;
              int  sys_upi=2401;

              switch (food) {
                case 1:
                System.out.println("Enter the quantity :");
                int quantity=sc.nextInt();
                double price= (quantity*food1);
                System.out.println("total bill :"+quantity+" x "+food1+" : "+ price);
                System.out.println("select the input :");
                System.out.println("1.confirmed\n2.cancelled");
                int order=sc.nextInt();
                
                if(order==1){
                    System.out.println("payment");
                    System.out.println("select the input ");
                    System.out.println("1.G-pay \n2.PhonePay");
                    int Payment=sc.nextInt();
                    if(Payment==1){
                        System.out.println("\t\t\t\t please wait...............");
                        Thread.sleep(1000);
                        System.out.println("total bill :"+price);
                        // System.out.print("Enter price :");
                        System.out.print("Enter UPI_PIN :");
                        int user_upi=sc.nextInt();
                        System.out.println(user_upi);
                        

                        if(sys_upi==user_upi){
                            int otp=rend.nextInt(9999);
                            System.out.println("Your otp is :"+otp);
                            System.out.print("Enter the otp :");
                            int user_otp=sc.nextInt();
                            if(user_otp==otp){
                                System.out.println("otp verified successfully....");
                                System.out.println("your order will be delivered soon.......");

                            }
                            else{
                                System.out.println("otp is wrong your order will be cancel");
                            }
                        }else{
                            System.out.println("somthing wrong");
                        }
                    }
                    else if(Payment==2){
                        System.out.println("\t\t\t\t please wait...............");
                        Thread.sleep(1000);
                        System.out.println("total bill :"+price);
                        System.out.print("Enter price :");
                        System.out.print("Enter UPI_PIN :");
                        int user_upi=sc.nextInt();
                        

                        if(sys_upi==user_upi){
                            int otp=rend.nextInt(9999);
                            System.out.println("Your otp is :"+otp);
                            System.out.print("Enter the otp :");
                            int user_otp=sc.nextInt();
                            if(user_otp==otp){
                                System.out.println("otp verified successfully....");
                                System.out.println("your order will be delivered soon.......");

                            }
                            else{
                                System.out.println("otp is wrong your order will be cancel");
                            }
                        }
                    

                    }
                
            }
                else{
                    System.out.println("order cancelled");
                }
                    break;
              
                default:
                  System.out.println("invalid food selection");
                    break;
              }

            
                break;
        
            default:
            System.out.print("invalid hotel selection");
                break;
        }

    }
    
}
