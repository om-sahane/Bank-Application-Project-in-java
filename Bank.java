import java.util.*;
class Bank {

    static String username;
    static long mobile;
    static String pan;
    static long adahar;
    static String address;
    static int pin;
    static double bal;
    final static long accountnumber = 1234123412234l;
    final static String ifsccode = "LCF1234";
    static ArrayList<String> statement = new ArrayList<>();

    public static void main(String[] args) 
    {
    welcome();    
    }

    public static void welcome()
    {
        for( ; ; )
        {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("****WELCOME****");
            System.out.println(" LAXMI CHIT FUND");
            System.out.println();
            System.out.println("1 .Existing User");
            System.out.println("2 .Create Account");
            System.out.println();
            System.out.println("ENTER An Option :");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    login(sc);
                    break;
                case 2:
                    createAccount(sc);
                    break;    
            
                default: 
                    System.out.println("Wrong Option Enterd");
                    break;
            }

        }
        
    }
     
    public static void login(Scanner sc)
    {
        if(username!=null)
        {
            for(int i=1;i<=3;i++)
            {
                System.out.println();
                System.out.println(" Login Page");
                System.out.println();
                System.out.println("Mobile no:");
                sc.nextLine();
                Long mobile1 = sc.nextLong();
                System.out.println(" Pin:");
                int pin1 =sc.nextInt();


                if ((mobile == mobile1) && (pin1 ==pin)) 
                {
                    homepage(sc);
                    
                }
                else{
                    System.out.println();
                    System.out.println("        ******  Congratulations !!!  *******     \n You Enterd Wrong Mobile no And Password");
                }

            }
            System.exit(0);
        }
       else{
        System.out.println("Create Your Account First  :");
       } 
    }




    
    public static void createAccount(Scanner sc) 
    {
        System.out.println();
        System.out.println(" Create An Account ");
        System.out.println();
        System.out.println("Usrename :");
        sc.nextLine();
        username = sc.nextLine();
        System.out.println("Contact no :");
        mobile =sc.nextLong();
        System.out.println("Adhar :");
        adahar=sc.nextLong();
        System.out.println("Pan :");
        pan = sc.next();
        System.out.println("Addresss:");
        sc.nextLine();
        address = sc.nextLine();
        System.out.println(" Pin :");
        pin =sc.nextInt();
        System.out.println("Enter an ammount to depostie :");
        bal = sc.nextDouble();
        statement.add("deposite :"+bal);
        System.out.println();
        System.out.println("An Account Created ");
        System.out.println();

        
    }



    
    public static void homepage(Scanner sc)
    {
        for( ; ; )
        {
            System.out.println();
            System.out.println("        ******WELECOME TO HOME PAGE******         ");
            System.out.println();
            System.out.println("1 .Deposite Amount");
            System.out.println("2 .Withdraw amount");
            System.out.println("3 .check balance");
            System.out.println("4 .statement");
            System.out.println("5 .Edit profile");
            System.out.println("6 .Logout");
            System.out.println();
            System.out.println("ENTER An Option :");
            int option = sc.nextInt();

            switch (option) {
                case 1:  deposite(sc); break;
                case 2:  withdraw(sc); break;   
                case 3:  checkBalance(sc);break;  
                case 4:  statement(sc);break;  
                case 5:  editProfile(sc);break;  
                case 6:   System.exit(0);   System.out.println("Thank You");  break; 

                default: 
                    System.out.println(" ****************Wrong Option Enterd *******************");
            }

        }
        
    }
    
    
    public static void deposite(Scanner sc) 
    {
        System.out.println("**************Deposite amount**************");
        System.out.println();
        System.out.println("Enter an amount");
        double depositeAmount = sc.nextDouble();
        bal += depositeAmount;
        statement.add("deposite :"+depositeAmount);
        System.out.println();
        System.out.println("Amount deposited successfully");


    }

    public static void withdraw(Scanner sc) 
    {
        for(int i=1;i<=3;i++)
        {
            System.out.println();
            System.out.println(" Withdraw Amount");
            System.out.println();
            System.out.println("ENter amount");
            double withdrawAmount= sc.nextDouble();
            System.out.println(" Pin:");
            int pin1 =sc.nextInt();


            if ((pin1 ==pin)) 
            {
              if(withdrawAmount<=bal)
              {
                bal-=withdrawAmount;
            statement.add("withdraw :"+ withdrawAmount);
            System.out.println("Amount debited successfully");
              }
              else{
                System.out.println("Insufficient funds");
              }
                return;
            }
            else{
                System.out.println();
                System.out.println("        ******  Congratulations !!!  *******     \n You Enterd Wrong pin");
            }

        }
        System.out.println();
        System.out.println("Your account is deactivate for 24 hours");
        System.exit(0);
    }





    public static void checkBalance(Scanner sc) 
    {
        for(int i=1;i<=3;i++)
        {
            System.out.println();
            System.out.println(" checkBlance");
            System.out.println();
            System.out.println(" Enter Pin:");
            int pin1 =sc.nextInt();


            if ((pin1 ==pin)) 
            {
              System.out.println();
              System.out.println("Amount balance is :"+bal+ "rs");
                return;
            }
            else{
                System.out.println();
                System.out.println("        ******  Congratulations !!!  *******     \n You Enterd Wrong pin");
            }

        }
        System.out.println();
        System.out.println("Your account is deactivate for 24 hours");
        System.exit(0);
    }

    public static void statement(Scanner sc)
    {
        System.out.println("***************************statement*********************************");
        System.out.println();
        for( String trans : statement)
        {
            System.out.println(trans);
        }
    }

    public static void editProfile(Scanner sc) 
    {
        for( ; ; )
        {
            System.out.println();
            System.out.println("        ******WELECOME     "+username+" TO Edit Profile******         ");
            System.out.println();
            System.out.println("1 .edit Username");
            System.out.println("2 .edit mobile no");
            System.out.println("3 .edit address");
            System.out.println("4 . edit pin");
            System.out.println("5 .Back to home page");
            System.out.println();
            System.out.println("ENTER An Option :");
            int option = sc.nextInt();

            switch (option) {
                case 1:  editUsername(sc); break;
                case 2:  editMobile(sc); break;   
                case 3:  editAddress(sc);break;  
                case 4:  editPin(sc);break;    
                case 5:   return; 
                default: 
                    System.out.println(" ****************Wrong Option Enterd *******************");
            }

        }
        

    }

    public static void editUsername(Scanner sc)
    {
        for(int i=1;i<=3 ;i++ )
        {
            System.out.println();
            System.out.println("**************Edit Username****************");
            System.out.println();
            System.out.println("Enter pin");
            int pin1 = sc.nextInt();

            if (pin1 == pin)
            {  System.out.println();
                System.out.println("Enter New Username");
                sc.nextLine();
             String   username1 = sc.nextLine();
                 username = username1;
                System.out.println();
                System.out.println("your New user name is "+username);
                  return;
              }
              else{
                  System.out.println();
                  System.out.println("        ******  Congratulations !!!  *******   \n You Enterd Wrong pin");
              }
  
          }
          System.out.println();
          System.out.println("Your account is deactivate for 24 hours");
          System.exit(0);
      }

      
    public static void editMobile(Scanner sc)
    {
        for(int i=1;i<=3 ;i++ )
        {
            System.out.println();
            System.out.println("**************Edit Mobile No****************");
            System.out.println();
            System.out.println("Enter pin");
            int pin1 = sc.nextInt();

            if (pin1 == pin)
            {  System.out.println();
                System.out.println("Enter New Moblie NO");
                sc.nextLine();
                long mobile1 = sc.nextLong();
                 mobile = mobile1;
                System.out.println();
                System.out.println(username+"your New mobile no is "+ mobile);
                  return;
              }
              else{
                  System.out.println();
                  System.out.println("        ******  Congratulations !!!  *******   \n You Enterd Wrong pin");
              }
  
          }
          System.out.println();
          System.out.println("Your account is deactivate for 24 hours");
          System.exit(0);
    }
    public static void editAddress(Scanner sc)
    {
        for(int i=1;i<=3 ;i++ )
        {
            System.out.println();
            System.out.println("**************Edit Address****************");
            System.out.println();
            System.out.println("Enter pin");
            int pin1 = sc.nextInt();

            if (pin1 == pin)
            {  System.out.println();
                System.out.println("Enter New Address");
                sc.nextLine();
                String address1= sc.nextLine();
                 address = address1;
                System.out.println();
                System.out.println(username+"your New address is "+ mobile);
                  return;
              }
              else{
                  System.out.println();
                  System.out.println("        ******  Congratulations !!!  *******   \n You Enterd Wrong pin");
              }
  
          }
          System.out.println();
          System.out.println("Your account is deactivate for 24 hours");
          System.exit(0);
    }
    public static void editPin(Scanner sc)
    {
        for(int i=1;i<=3 ;i++ )
        {
            System.out.println();
            System.out.println("**************Edit Pin***************");
            System.out.println();
            System.out.println("Enter mobno");
            long mob1= sc.nextLong();

            if (mob1 == mobile)
            {  System.out.println();
                System.out.println("Enter New  Pin");
                sc.nextLine();
               int pin1 = sc.nextInt();
                pin = pin1;
                System.out.println();
                System.out.println(username+"your New Pin is "+ pin);
                  return;
              }
              else{
                  System.out.println();
                  System.out.println("        ******  Congratulations !!!  *******   \n You Enterd Wrong pin");
              }
  
          }
          System.out.println();
          System.out.println("Your account is deactivate for 24 hours");
          System.exit(0);
      
    }


                
 }




