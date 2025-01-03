
import java.util.*;
class otp{
    static Scanner sc= new Scanner(System.in);
    static Random rend = new Random();
    public static void main(String[]args)throws Exception{

        System.out.println("\t\t welcome to swiggy");
        System.out.println("\t\t\t Are you hugerrrrr........");
        System.out.println("\t\t Select the hotel ");
        System.out.println("1.bhuhari\n2.billal\n3.Amma canteen\n4.A2B");
        int hotel=sc.nextInt();
        int sys_upi_pin = 3456;

        switch (hotel) {
            case 1:{
                System.out.println(" Welcome to Bhuhari ");
                System.out.println("Select the Food you Want ");
                System.out.println("1.Chicken-65         -  Rs.120 ");
                System.out.println("2.Chicken Biriyani   -  Rs.220 ");
                System.out.println("3.Mutton Biriyani    -  Rs.260 ");
                System.out.println("4.prawn Biriyani      -  Rs.240 ");
                System.out.print("Enter the food :");
                int food = sc.nextInt();
                double food1 = 120;
                double food2 = 220;
                double food3 = 260;
                double food4 = 240;

                switch(food){

                    case 1 :{
                        System.out.print("Enter the Quantity :");
                        double quantity = sc.nextDouble();

                        double price = (quantity * food1);
                        System.out.println("Total Bill is "+quantity+" x "+food1+" : "+price);
                        System.out.println("\nSelect the input ");
                        System.out.println("1.Confirm\n2.Cancel");
                        int order = sc.nextInt();

                        switch (order) {
                            case 1:{ 
                                System.out.println("Payment Page");
                                Thread.sleep(2000);
                                System.out.println("Select the input ");
                                System.out.println("\n1.Gpay\n2.Phonepay");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;}
                                    case 2:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;
                                    }
                                        
                                       
                                
                                    default:
                                        System.out.println("invalid option9");
                                        break;
                                }


                                
                                break;
                            }
                                
                            case 2:{
                                System.out.println("order cancelled");
                                
                                break;}    
                        
                            default:
                                break;
                        }
                        




                        break;
                    }
                    case 2:{
                        System.out.print("Enter the Quantity :");
                        double quantity = sc.nextDouble();

                        double price = (quantity * food2);
                        System.out.println("Total Bill is "+quantity+" x "+food2+" : "+price);
                        System.out.println("\nSelect the input ");
                        System.out.println("1.Confirm\n2.Cancel");
                        int order = sc.nextInt();

                        switch (order) {
                            case 1:{ 
                                System.out.println("Payment Page");
                                Thread.sleep(2000);
                                System.out.println("Select the input ");
                                System.out.println("\n1.Gpay\n2.Phonepay");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;}
                                    case 2:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;
                                    }
                                        
                                       
                                
                                    default:
                                        break;
                                }


                                
                                break;
                            }
                                
                            case 2:{
                                System.out.println("order cancelled");
                                
                                break;}    
                        
                            default:
                                break;
                        }
                        




                        

                        break;
                    }
                    case 3 :{
                        System.out.print("Enter the Quantity :");
                        double quantity = sc.nextDouble();

                        double price = (quantity * food3);
                        System.out.println("Total Bill is "+quantity+" x "+food3+" : "+price);
                        System.out.println("\nSelect the input ");
                        System.out.println("1.Confirm\n2.Cancel");
                        int order = sc.nextInt();

                        switch (order) {
                            case 1:{ 
                                System.out.println("Payment Page");
                                Thread.sleep(2000);
                                System.out.println("Select the input ");
                                System.out.println("\n1.Gpay\n2.Phonepay");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;}
                                    case 2:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;
                                    }
                                        
                                       
                                
                                    default:
                                        break;
                                }


                                
                                break;
                            }
                                
                            case 2:{
                                System.out.println("order cancelled");
                                
                                break;}    
                        
                            default:
                                break;
                        }
                        




                        
                        break;
                    }
                    case 4 :{
                        System.out.print("Enter the Quantity :");
                        double quantity = sc.nextDouble();

                        double price = (quantity * food4);
                        System.out.println("Total Bill is "+quantity+" x "+food4+" : "+price);
                        System.out.println("\nSelect the input ");
                        System.out.println("1.Confirm\n2.Cancel");
                        int order = sc.nextInt();

                        switch (order) {
                            case 1:{ 
                                System.out.println("Payment Page");
                                Thread.sleep(2000);
                                System.out.println("Select the input ");
                                System.out.println("\n1.Gpay\n2.Phonepay");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;}
                                    case 2:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;
                                    }
                                        
                                       
                                
                                    default:
                                        break;
                                }


                                
                                break;
                            }
                                
                            case 2:{
                                System.out.println("order cancelled");
                                
                                break;}    
                        
                            default:
                                break;
                        }
                        




                        
                        break;
                    }



                }
                
                break;
            }
            case 2:{
                System.out.println(" GREETINGS FROM BILALL......... ");
                System.out.println("Select the Food you Want ");
                System.out.println("1.Chicken-65         -  Rs.100 ");
                System.out.println("2.Chicken Biriyani   -  Rs.200 ");
                System.out.println("3.Mutton Biriyani    -  Rs.300 ");
                System.out.println("4.Beef Biriyani      -  Rs.240 ");
                System.out.print("Enter the food :");
                int food = sc.nextInt();
                double food1 = 100;
                double food2 = 200;
                double food3 = 300;
                double food4 = 240;

                switch(food){

                    case 1 :{
                        System.out.print("Enter the Quantity :");
                        double quantity = sc.nextDouble();

                        double price = (quantity * food1);
                        System.out.println("Total Bill is "+quantity+" x "+food1+" : "+price);
                        System.out.println("\nSelect the input ");
                        System.out.println("1.Confirm\n2.Cancel");
                        int order = sc.nextInt();

                        switch (order) {
                            case 1:{ 
                                System.out.println("Payment Page");
                                Thread.sleep(2000);
                                System.out.println("Select the input ");
                                System.out.println("\n1.Gpay\n2.Phonepay");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;}
                                    case 2:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;
                                    }
                                        
                                       
                                
                                    default:
                                        System.out.println("invalid option9");
                                        break;
                                }


                                
                                break;
                            }
                                
                            case 2:{
                                System.out.println("order cancelled");
                                
                                break;}    
                        
                            default:
                                break;
                        }
                        




                        break;
                    }
                    case 2:{
                        System.out.print("Enter the Quantity :");
                        double quantity = sc.nextDouble();

                        double price = (quantity * food2);
                        System.out.println("Total Bill is "+quantity+" x "+food2+" : "+price);
                        System.out.println("\nSelect the input ");
                        System.out.println("1.Confirm\n2.Cancel");
                        int order = sc.nextInt();

                        switch (order) {
                            case 1:{ 
                                System.out.println("Payment Page");
                                Thread.sleep(2000);
                                System.out.println("Select the input ");
                                System.out.println("\n1.Gpay\n2.Phonepay");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;}
                                    case 2:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;
                                    }
                                        
                                       
                                
                                    default:
                                        break;
                                }


                                
                                break;
                            }
                                
                            case 2:{
                                System.out.println("order cancelled");
                                
                                break;}    
                        
                            default:
                                break;
                        }
                        




                        

                        break;
                    }
                    case 3 :{
                        System.out.print("Enter the Quantity :");
                        double quantity = sc.nextDouble();

                        double price = (quantity * food3);
                        System.out.println("Total Bill is "+quantity+" x "+food3+" : "+price);
                        System.out.println("\nSelect the input ");
                        System.out.println("1.Confirm\n2.Cancel");
                        int order = sc.nextInt();

                        switch (order) {
                            case 1:{ 
                                System.out.println("Payment Page");
                                Thread.sleep(2000);
                                System.out.println("Select the input ");
                                System.out.println("\n1.Gpay\n2.Phonepay");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;}
                                    case 2:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;
                                    }
                                        
                                       
                                
                                    default:
                                        break;
                                }


                                
                                break;
                            }
                                
                            case 2:{
                                System.out.println("order cancelled");
                                
                                break;}    
                        
                            default:
                                break;
                        }
                        




                        
                        break;
                    }
                    case 4 :{
                        System.out.print("Enter the Quantity :");
                        double quantity = sc.nextDouble();

                        double price = (quantity * food4);
                        System.out.println("Total Bill is "+quantity+" x "+food4+" : "+price);
                        System.out.println("\nSelect the input ");
                        System.out.println("1.Confirm\n2.Cancel");
                        int order = sc.nextInt();

                        switch (order) {
                            case 1:{ 
                                System.out.println("Payment Page");
                                Thread.sleep(2000);
                                System.out.println("Select the input ");
                                System.out.println("\n1.Gpay\n2.Phonepay");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;}
                                    case 2:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;
                                    }
                                        
                                       
                                
                                    default:
                                        break;
                                }


                                
                                break;
                            }
                                
                            case 2:{
                                System.out.println("order cancelled");
                                
                                break;}    
                        
                            default:
                                break;
                        }
                        




                        
                        break;
                    }



                }
                
                break; 
            }
            case 3:{
                System.out.println(" Welcome to AMMA UNAVAGAM...... ");
                System.out.println("Select the Food you Want ");
                System.out.println("1.idly               -  Rs.2 ");
                System.out.println("2.pongal             -  Rs.5");
                System.out.println("3.curd rice          -  Rs.6 ");
                System.out.println("4.tomato rice        -  Rs.14 ");
                System.out.print("Enter the food :");
                int food = sc.nextInt();
                double food1 = 2;
                double food2 = 5;
                double food3 = 6;
                double food4 = 14;

                switch(food){

                    case 1 :{
                        System.out.print("Enter the Quantity :");
                        double quantity = sc.nextDouble();

                        double price = (quantity * food1);
                        System.out.println("Total Bill is "+quantity+" x "+food1+" : "+price);
                        System.out.println("\nSelect the input ");
                        System.out.println("1.Confirm\n2.Cancel");
                        int order = sc.nextInt();

                        switch (order) {
                            case 1:{ 
                                System.out.println("Payment Page");
                                Thread.sleep(2000);
                                System.out.println("Select the input ");
                                System.out.println("\n1.Gpay\n2.Phonepay");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;}
                                    case 2:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;
                                    }
                                        
                                       
                                
                                    default:
                                        System.out.println("invalid option9");
                                        break;
                                }


                                
                                break;
                            }
                                
                            case 2:{
                                System.out.println("order cancelled");
                                
                                break;}    
                        
                            default:
                                break;
                        }
                        




                        break;
                    }
                    case 2:{
                        System.out.print("Enter the Quantity :");
                        double quantity = sc.nextDouble();

                        double price = (quantity * food2);
                        System.out.println("Total Bill is "+quantity+" x "+food2+" : "+price);
                        System.out.println("\nSelect the input ");
                        System.out.println("1.Confirm\n2.Cancel");
                        int order = sc.nextInt();

                        switch (order) {
                            case 1:{ 
                                System.out.println("Payment Page");
                                Thread.sleep(2000);
                                System.out.println("Select the input ");
                                System.out.println("\n1.Gpay\n2.Phonepay");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;}
                                    case 2:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;
                                    }
                                        
                                       
                                
                                    default:
                                        break;
                                }


                                
                                break;
                            }
                                
                            case 2:{
                                System.out.println("order cancelled");
                                
                                break;}    
                        
                            default:
                                break;
                        }
                        




                        

                        break;
                    }
                    case 3 :{
                        System.out.print("Enter the Quantity :");
                        double quantity = sc.nextDouble();

                        double price = (quantity * food3);
                        System.out.println("Total Bill is "+quantity+" x "+food3+" : "+price);
                        System.out.println("\nSelect the input ");
                        System.out.println("1.Confirm\n2.Cancel");
                        int order = sc.nextInt();

                        switch (order) {
                            case 1:{ 
                                System.out.println("Payment Page");
                                Thread.sleep(2000);
                                System.out.println("Select the input ");
                                System.out.println("\n1.Gpay\n2.Phonepay");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;}
                                    case 2:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;
                                    }
                                        
                                       
                                
                                    default:
                                        break;
                                }


                                
                                break;
                            }
                                
                            case 2:{
                                System.out.println("order cancelled");
                                
                                break;}    
                        
                            default:
                                break;
                        }
                        




                        
                        break;
                    }
                    case 4 :{
                        System.out.print("Enter the Quantity :");
                        double quantity = sc.nextDouble();

                        double price = (quantity * food4);
                        System.out.println("Total Bill is "+quantity+" x "+food4+" : "+price);
                        System.out.println("\nSelect the input ");
                        System.out.println("1.Confirm\n2.Cancel");
                        int order = sc.nextInt();

                        switch (order) {
                            case 1:{ 
                                System.out.println("Payment Page");
                                Thread.sleep(2000);
                                System.out.println("Select the input ");
                                System.out.println("\n1.Gpay\n2.Phonepay");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;}
                                    case 2:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;
                                    }
                                        
                                       
                                
                                    default:
                                        break;
                                }


                                
                                break;
                            }
                                
                            case 2:{
                                System.out.println("order cancelled");
                                
                                break;}    
                        
                            default:
                                break;
                        }
                        




                        
                        break;
                    }



                }
                
                break;
            }
            case 4:{
                System.out.println(" GREETINGS FROM A2B ");
                System.out.println("Select the Food you Want ");
                System.out.println("1.Chicken-65         -  Rs.180 ");
                System.out.println("2.Chicken Biriyani   -  Rs.320 ");
                System.out.println("3.Mutton Biriyani    -  Rs.460 ");
                System.out.println("4.Beef Biriyani      -  Rs.140 ");
                System.out.print("Enter the food :");
                int food = sc.nextInt();
                double food1 = 180;
                double food2 = 320;
                double food3 = 460;
                double food4 = 140;

                switch(food){

                    case 1 :{
                        System.out.print("Enter the Quantity :");
                        double quantity = sc.nextDouble();

                        double price = (quantity * food1);
                        System.out.println("Total Bill is "+quantity+" x "+food1+" : "+price);
                        System.out.println("\nSelect the input ");
                        System.out.println("1.Confirm\n2.Cancel");
                        int order = sc.nextInt();

                        switch (order) {
                            case 1:{ 
                                System.out.println("Payment Page");
                                Thread.sleep(2000);
                                System.out.println("Select the input ");
                                System.out.println("\n1.Gpay\n2.Phonepay");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;}
                                    case 2:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;
                                    }
                                        
                                       
                                
                                    default:
                                        System.out.println("invalid option9");
                                        break;
                                }


                                
                                break;
                            }
                                
                            case 2:{
                                System.out.println("order cancelled");
                                
                                break;}    
                        
                            default:
                                break;
                        }
                        




                        break;
                    }
                    case 2:{
                        System.out.print("Enter the Quantity :");
                        double quantity = sc.nextDouble();

                        double price = (quantity * food2);
                        System.out.println("Total Bill is "+quantity+" x "+food2+" : "+price);
                        System.out.println("\nSelect the input ");
                        System.out.println("1.Confirm\n2.Cancel");
                        int order = sc.nextInt();

                        switch (order) {
                            case 1:{ 
                                System.out.println("Payment Page");
                                Thread.sleep(2000);
                                System.out.println("Select the input ");
                                System.out.println("\n1.Gpay\n2.Phonepay");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;}
                                    case 2:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;
                                    }
                                        
                                       
                                
                                    default:
                                        break;
                                }


                                
                                break;
                            }
                                
                            case 2:{
                                System.out.println("order cancelled");
                                
                                break;}    
                        
                            default:
                                break;
                        }
                        




                        

                        break;
                    }
                    case 3 :{
                        System.out.print("Enter the Quantity :");
                        double quantity = sc.nextDouble();

                        double price = (quantity * food3);
                        System.out.println("Total Bill is "+quantity+" x "+food3+" : "+price);
                        System.out.println("\nSelect the input ");
                        System.out.println("1.Confirm\n2.Cancel");
                        int order = sc.nextInt();

                        switch (order) {
                            case 1:{ 
                                System.out.println("Payment Page");
                                Thread.sleep(2000);
                                System.out.println("Select the input ");
                                System.out.println("\n1.Gpay\n2.Phonepay");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;}
                                    case 2:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;
                                    }
                                        
                                       
                                
                                    default:
                                        break;
                                }


                                
                                break;
                            }
                                
                            case 2:{
                                System.out.println("order cancelled");
                                
                                break;}    
                        
                            default:
                                break;
                        }
                        




                        
                        break;
                    }
                    case 4 :{
                        System.out.print("Enter the Quantity :");
                        double quantity = sc.nextDouble();

                        double price = (quantity * food4);
                        System.out.println("Total Bill is "+quantity+" x "+food4+" : "+price);
                        System.out.println("\nSelect the input ");
                        System.out.println("1.Confirm\n2.Cancel");
                        int order = sc.nextInt();

                        switch (order) {
                            case 1:{ 
                                System.out.println("Payment Page");
                                Thread.sleep(2000);
                                System.out.println("Select the input ");
                                System.out.println("\n1.Gpay\n2.Phonepay");
                                int pay = sc.nextInt();
                                switch (pay) {
                                    case 1:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;}
                                    case 2:{
                                        System.out.println("Total Bill :"+price);
                                        System.out.print("Enter the price :");
                                        double user_price = sc.nextDouble();
                                        if(price == user_price)
                                        {
                                            System.out.print("Enter upi pin :");
                                            int user_upi_pin = sc.nextInt();

                                            if(sys_upi_pin == user_upi_pin)
                                            {
                                                System.out.println("Please Wait....");
                                                Thread.sleep(2000);
                                                
                                                int sys_otp = rend.nextInt(10000);
                                                System.out.println("Otp is : "+sys_otp);
                                                System.out.print("Enter otp :");
                                                int user_otp = sc.nextInt();
                                                if(sys_otp==user_otp){
                                                    System.out.println("Opt verified Success...");
                                                    System.out.println("Thanks for ordering  your order will be deliver soon....");
                                                }
                                                else{
                                                    System.out.println("Opt is wrong your order will be cancelled ");
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("Pin not matched Order will be Cancelled");
                                            }
                                        }

                                        
                                        break;
                                    }
                                        
                                       
                                
                                    default:
                                        break;
                                }


                                
                                break;
                            }
                                
                            case 2:{
                                System.out.println("order cancelled");
                                
                                break;}    
                        
                            default:
                                break;
                        }
                        




                        
                        break;
                    }



                }
                
                break;
            }

            default:
                System.out.println("invalid hotel selection");
                break;
        }
    }
}