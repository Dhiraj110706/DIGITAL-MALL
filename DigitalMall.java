import java.util.*;
class DigitalMall
{
    public static final String BLUE_COLOR = "\u001B[34m";
	public static final String GREEN_COLOR = "\u001B[32m";
	public static final String RESET_COLOR = "\u001B[0m";
    public static final String RED_COLOR = "\u001B[31m";
	public static final String YELLOW_COLOR = "\u001B[33m";
    public static final String MAGENTA_COLOR = "\u001B[35m";
    public static final String CYAN_COLOR = "\u001B[36m";
	public static final String COREL_COLOR = "\u001B[38;5;209m";

    public static void main(String[] args)
    {
        System.out.println(COREL_COLOR+"================================================");
        System.out.println("--------------Welcome to DigitalMal-------------");
        System.out.println("================================================"+RESET_COLOR);
        Scanner sc = new Scanner(System.in); 
        Mobile m[] = new Mobile[6];
        Laptop L[] = new Laptop[6];
        Television T[] = new Television[6];
        SmartWatch S[] = new SmartWatch[6];
        
        m[0] = new Mobile("Mobile","IPhone 15 PRO" , 150000,150);
        m[1] = new Mobile("Mobile","Galaxy S24 Ultra 5G" ,130000,200);
        m[2] = new Mobile("Mobile","Google Pixel 8",75000,1000);
        m[3] = new Mobile("Mobile","OnePlus 10T 5G",50000,400);
        m[4] = new Mobile("Mobile","Redmi Note 13 Pro 5G", 30000,500);
        m[5] = new Mobile("Mobile","IQOO Z7 Pro 5G", 21000,450);
        L[0] = new Laptop("Laptop","MacBook M3 Chip",176000,250);
        L[1] = new Laptop("Laptop","Galaxy Book3 Pro 360",150000,300);
        L[2] = new Laptop("Laptop","Lenovo IdeaPad Pro 5i 13th Gen" ,100000,350 );
        L[3] = new Laptop("Laptop","Asus-ROG Strix G16 ", 95000,100);
        L[4] = new Laptop("Laptop","HP Pavallion Intel Core i7 13th Gen", 85000,500);
        L[5] = new Laptop("Laptop","Acer -Aspire5 Gaming Laptop Intel Core i5 12th Gen ", 52000,25);
        T[0] = new Television("Television","Sony Bravia 65 inch" , 105000,150);
        T[1] = new Television("Television","OnePlus Q2 Pro 65 inch", 70000,200);
        T[2] = new Television("Television","Samsung Crystal 4K 65 inch ", 63000,100);
        T[3] = new Television("Television","Acer W Series 4K Ultra HD 55 inch", 53000,50);
        T[4] = new Television("Television","Mi 5X Series 4K LED 55 inch", 45000,75);
        T[5] = new Television("Television","LG 4K Ultra HD 43 inch", 30000,100);
        S[0] = new SmartWatch("SmartWatch","Apple Watch Series 9" ,90000,25 );
        S[1] = new SmartWatch("SmartWatch","Galaxy Watch 6 Pro ",38000,35);
        S[2] = new SmartWatch("SmartWatch","Pixel Watch-Android Smartwatch", 25000,50);
        S[3] = new SmartWatch("SmartWatch","FITBIT Versa 3 Health& FItness ",16000,200);
        S[4] = new SmartWatch("SmartWatch","boAt Watch Blaze",70000,150);
        S[5] = new SmartWatch("SmartWatch","FireBoult", 1500,500);
        int choice = 0 ;
        while(choice !=5)
        {
            System.out.println();
            System.out.println(CYAN_COLOR+"Select 1 for buy Mobile");
            System.out.println("Select 2 for buy Laptop"); 
            System.out.println("Select 3 for buy Television"); 
            System.out.println("Select 4 for buy Smart Watch");
            System.out.println("Select 5 for  Exit"+RESET_COLOR);
            choice = sc.nextInt();
            System.out.println();
            int  k = 0 ;
            switch(choice )
            {
                case 1 :
                {
                    System.out.println(MAGENTA_COLOR+"You will receive latest mobile");
                    System.out.println("Detatils of Mobile :- "+RESET_COLOR);
                    m[0].display(m);
                    System.out.print("Enter Choice :");
                    k = sc.nextInt();
                    System.out.println();
                    switch(k)
                    {
                        case 1 :
                        {
                            System.out.println("Thanks for purchasing "+m[0].name);
                            System.out.println("Please pay "+m[0].price);
                            
                            m[0].payment(m[0].price);
                            break;
                        }
                        case 2 :
                        {
                            System.out.println("Thanks for purchasing "+m[1].name);
                            System.out.println("Please pay "+m[1].price);
                            m[1].payment(m[1].price);
                            break;
                        }
                        case 3 :
                        {
                            System.out.println("Thanks for purchasing "+m[2].name);
                            System.out.println("Please pay "+m[2].price);
                            m[2].payment(m[2].price);
                            break;
                        }
                        case 4 :
                        {
                            System.out.println("Thanks for purchasing "+m[3].name);
                            System.out.println("Please pay "+m[3].price);
                            m[3].payment(m[3].price);
                            break;
                        }
                        case 5 :
                        {
                            System.out.println("Thanks for purchasing "+m[4].name);
                            System.out.println("Please pay "+m[4].price);
                            m[4].payment(m[4].price);
                            break;
                        }
                        case 6 :
                        {
                            System.out.println("Thanks for purchasing "+m[5].name);
                            System.out.println("Please pay "+m[5].price);
                            m[5].payment(m[5].price);
                            break;
                        }
                        default :
                        {
                            System.out.println(RED_COLOR+"!!! Invalid Choice"+RESET_COLOR);
                            break;
                        }

                    }
                    break;
                }
                case 2 :
                {
                    System.out.println("You will receive latest laptp");
                    System.out.println("Detatils of Laptop :- ");
                    L[0].display(L);
                    System.out.print("Enter Choice :");
                    k = sc.nextInt();
                    switch(k)
                    {
                        case 1 :
                        {
                            System.out.println("Thanks for purchasing "+L[0].name);
                            System.out.println("Please pay "+L[0].price);
                            L[0].payment(L[0].price);
                            break;
                        }
                        case 2 :
                        {
                            System.out.println("Thanks for purchasing "+L[1].name);
                            System.out.println("Please pay "+L[1].price);
                            L[1].payment(L[1].price);
                            break;
                        }
                        case 3 :
                        {
                            System.out.println("Thanks for purchasing "+L[2].name);
                            System.out.println("Please pay "+L[2].price);
                            L[2].payment(L[2].price);
                            break;
                        }
                        case 4 :
                        {
                            System.out.println("Thanks for purchasing "+L[3].name);
                            System.out.println("Please pay "+L[3].price);
                            L[3].payment(L[3].price);
                            break;
                        }
                        case 5 :
                        {
                            System.out.println("Thanks for purchasing "+L[4].name);
                            System.out.println("Please pay "+L[4].price);
                            L[4].payment(L[4].price);
                            break;
                        }
                        case 6 :
                        {
                            System.out.println("Thanks for purchasing "+L[5].name);
                            System.out.println("Please pay "+L[5].price);
                            L[5].payment(L[5].price);
                            break;
                        }
                        default :
                        {
                            System.out.println(RED_COLOR+"!!! Invalid Choice"+RESET_COLOR);
                            break;
                        }

                    }
                    break;
                }
                case 3 :
                {
                    System.out.println("You will receive latest television");
                    System.out.println("Detatils of Television :- ");
                    T[0].display(T);
                    System.out.print("Enter Choice :");
                    k = sc.nextInt();
                    switch(k)
                    {
                        case 1 :
                        {
                            System.out.println("Thanks for purchasing "+T[0].name);
                            System.out.println("Please pay "+T[0].price);
                            T[0].payment(T[0].price);
                            break;
                        }
                        case 2 :
                        {
                            System.out.println("Thanks for purchasing "+T[1].name);
                            System.out.println("Please pay "+T[1].price);
                            T[1].payment(T[1].price);
                            break;
                        }
                        case 3 :
                        {
                            System.out.println("Thanks for purchasing "+T[2].name);
                            System.out.println("Please pay "+T[2].price);
                            T[2].payment(T[2].price);
                            break;
                        }
                        case 4 :
                        {
                            System.out.println("Thanks for purchasing "+T[3].name);
                            System.out.println("Please pay "+T[3].price);
                            T[3].payment(T[3].price);
                            break;
                        }
                        case 5 :
                        {
                            System.out.println("Thanks for purchasing "+T[4].name);
                            System.out.println("Please pay "+T[4].price);
                            T[4].payment(T[4].price);
                            break;
                        }
                        case 6 :
                        {
                            System.out.println("Thanks for purchasing "+T[5].name);
                            System.out.println("Please pay "+T[5].price);
                            T[5].payment(T[5].price);
                            break;
                        }
                        default :
                        {
                            System.out.println(RED_COLOR+"!!! Invalid Choice"+RESET_COLOR);
                            break;
                        }
                    }
                    break;
                }
                case 4 :
                {
                    System.out.println("You will receive latest smart watch");
                    System.out.println("Detatils of SmartWatch :- ");
                    S[0].display(S);
                    System.out.print("Enter Choice :");
                    k = sc.nextInt();
                    switch(k)
                    {
                        case 1 :
                        {
                            System.out.println("Thanks for purchasing "+S[0].name);
                            System.out.println("Please pay "+S[0].price);
                            S[0].payment(S[0].price);
                            break;
                        }
                        case 2 :
                        {
                            System.out.println("Thanks for purchasing "+S[1].name);
                            System.out.println("Please pay "+S[1].price);
                            S[1].payment(S[1].price);
                            break;
                        }
                        case 3 :
                        {
                            System.out.println("Thanks for purchasing "+S[2].name);
                            System.out.println("Please pay "+S[2].price);
                            S[2].payment(S[2].price);
                            break;
                        }
                        case 4 :
                        {
                            System.out.println("Thanks for purchasing "+S[3].name);
                            System.out.println("Please pay "+S[3].price);
                            S[3].payment(S[3].price);
                            break;
                        }
                        case 5 :
                        {
                            System.out.println("Thanks for purchasing "+S[4].name);
                            System.out.println("Please pay "+S[4].price);
                            S[4].payment(S[4].price);
                            break;
                        }
                        case 6 :
                        {
                            System.out.println("Thanks for purchasing "+S[5].name);
                            System.out.println("Please pay "+S[5].price);
                            S[5].payment(S[5].price);
                            break;
                        }
                        default :
                        {
                            System.out.println(RED_COLOR+"!!! Invalid Choice"+RESET_COLOR);
                            break;
                        }

                    }    
                    break;
                }
                case 5 :
                {
                    System.out.println(CYAN_COLOR+"Thanks for Visit");
                    System.out.println("Visit Again"+RESET_COLOR);
                    System.exit(1);
                }
            }
        }
        sc.close();
    }
    
}
class DigiItems
{
    public static final String BLUE_COLOR = "\u001B[34m";
	public static final String GREEN_COLOR = "\u001B[32m";
	public static final String RESET_COLOR = "\u001B[0m";
    public static final String RED_COLOR = "\u001B[31m";
	public static final String YELLOW_COLOR = "\u001B[33m";
    public static final String CYAN_COLOR = "\u001B[36m";
	public static final String COREL_COLOR = "\u001B[38;5;209m";
    Scanner sc = new Scanner(System.in);
    String digiItemtype ;
    String name  ;
    double price;
    double quantity ;
    DigiItems(String digiItemtype ,String name,double price,double quantity)
    {
        this.digiItemtype = digiItemtype;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    void display(DigiItems[] d)
    {
        System.out.println();
        for(int i = 0 ; i< d.length ; i++)
        {
            System.out.println(YELLOW_COLOR+"Product : "+(i+1)+" "+d[i].digiItemtype+"Name : "+d[i].name+"Price : "+d[i].price+"Quantity : "+d[i].quantity+RESET_COLOR);
            System.out.println();
        }
    }
    
    
    void payment(double price)
    {
        while(true)
        {
            System.out.println();
            System.out.println("You have three ways to pay this amount : "+price);
            System.out.println();
            System.out.println("Press 1 for NetBanking");
            System.out.println("Press 2 for DebitCard");
            System.out.println("Press 3 for Cash");
            int choice = sc.nextInt() ;
            int flag = 0;
            switch(choice)
            {
                case 1 :
                {
                    System.out.println();
                    System.out.println("Payable Amount is: "+price);
                    while(true)
                    {
                        System.out.println();
                        System.out.println("Enter UPI Pin: ");
                        String pass = sc.next();
                        System.out.println(pass);
                        if(pass.length()==4)
                        {
                            flag=1;
                            break;
                        }
                        else
                        {
                            System.out.println(RED_COLOR+"!!! Invalid PIN");
                            System.out.println("Enter 4 digit UPI Pin"+RESET_COLOR);
                        }
                    }
                    break ;
                }
                case 2 :
                {
                    while(true)
                    {
                        System.out.println();
                        int flag2=0;
                        System.out.println("For Payment of Rs."+price);
                        System.out.println("Enter your 12 Digit Debit Card Number");
                        System.out.println();
                        String card=sc.next();
                        System.out.println();
                        if(card.length()==12)
                        {
                            for(int i=0;i<card.length();i++)
                            {
                                if(card.charAt(i)>='0' && card.charAt(i)<='9')
                                {
                                    flag2=1;
                                    continue;
                                }
                                else
                                {
                                    System.out.println(RED_COLOR+"Kindly Enter Digit of Debit Card Number between 0 to 9"+RESET_COLOR);
                                    System.out.println("& Kindly pay "+price);
                                    flag2=0;
                                    break;
                                }
                            }
                        }
                        else
                        {
                            System.out.println(RED_COLOR+"Kindly Enter 12 Digit Debit Card Number"+RESET_COLOR);
                            System.out.println("& Kindly pay "+price);
                            continue;
                        }
                        if(flag2==1)
                        {
                            System.out.println("Enter 3 Digit CVV: ");
                            String cvv=sc.next();
                            System.out.println();
                            if(cvv.length()==3)
                            {
                                for(int i=0;i<cvv.length();i++)
                                {
                                    if(card.charAt(i)>='0' && card.charAt(i)<='9')
                                    {
                                        flag2=1;
                                        continue;
                                    }
                                    else
                                    {
                                        System.out.println(RED_COLOR+"Kindly Enter Digit of CVV between 0 to 9"+RESET_COLOR);
                                        System.out.println("& Kindly pay "+price);
                                        flag2=0;
                                        break;
                                    }
                                }
                            }
                            else
                            {
                                System.out.println(RED_COLOR+"Kindly Enter 3 Digit CVV back on your Debit Card"+RESET_COLOR);
                                System.out.println("& Kindly pay "+price);
                                flag2=0;
                                continue;
                            }
                        }

                        if(flag2==1)
                        {
                            System.out.println("Payable Amount is: "+price);
                            System.out.println();
                            System.out.println(GREEN_COLOR+"OTP :- 1234 "+RESET_COLOR);
                            System.out.println("Enter OTP: ");
                            int otp_card=sc.nextInt();

                            if(otp_card==1234)
                            {
                                flag=1;
                                System.out.println();
                                System.out.println(COREL_COLOR+"Payment Received Successfully of Rs."+price+RESET_COLOR);
                                break;
                            }
                            else
                            {
                                System.out.println("Recieved OTP did'n match");
                                System.out.println("Payment Failed!");
                                continue;
                            }
                        }
                    }
                    
                    break ;
                }
                case 3 :
                {
                    while(true)
                    {
                        System.out.print("Enter amount => ");
                        double amount = sc.nextDouble();
                        if(amount ==price)
                        {
                            flag = 1 ;
                            break;
                        }
                    }
                    break;
                }
                default :
                {
                    System.out.println(RED_COLOR+"Kindly Enter Valid Option"+RESET_COLOR);
                }
            }
            if(flag == 1)
            {
                System.out.println();
                System.out.println(GREEN_COLOR+"We Recieved Your Payment of "+price);
                System.out.println("-------------------------------------Thank You-------------------------------------------"+RESET_COLOR);
                break;
            }
        }
    }
}
class Mobile extends DigiItems
{
    Mobile(String digiItemtype ,String name,double price,double quantity)
    {
        super(digiItemtype,name,price,quantity);
    }
}
class Laptop extends DigiItems
{
    Laptop(String digiItemtype ,String name,double price,double quantity)
    {
        super(digiItemtype,name,price,quantity);
    }
}
class Television extends DigiItems
{
    Television(String digiItemtype ,String name,double price,double quantity)
    {
        super(digiItemtype,name,price,quantity);
    }
}
class SmartWatch  extends DigiItems
{
    SmartWatch(String digiItemtype ,String name,double price,double quantity)
    {
        super(digiItemtype,name,price,quantity);
    }
}
