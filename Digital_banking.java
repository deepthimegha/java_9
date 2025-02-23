import java.util.Scanner;
class  Digital_banking
{
	String username="Deepthimeghana";
	String pincode="999999999";
	double balance=456;
	public static void main(String[] args) 
	{
		System.out.println("start main");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the username:");
			String uname=sc.next();
			System.out.println("enter the pincode:");
            String pin =sc.next();
System.out.println("enter the deposit amount:");
double num =sc.nextDouble();
System.out.println("enter the withdrawal amount:");
double num1=sc.nextDouble();
System.out.println("enter the balance amount:");
int num2=sc.nextInt();
System.out.println("end main");
	}
public static void opearation(String uname,String pin,double num,double num1,int num2)
		{
	      Digital_banking d=new Digital_banking();
		  int check=0;
		  while(check<3)
			  {
		    System.out.println("enter the username:");
			String uname=sc.next();
			System.out.println("enter the pincode:");
            String pin =sc.next();
			  
		if((pin.equals(d.pincode))&&(uname.equals(d.username)))
		{//correctpin is equal to user passcode pin
		System.out.println("select an option 1,2,3");//for further process
		System.out.println("1=credit,2=deposit,3=checkbalance");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		switch (option)
		{
		
		case 1:
			{
				deposit(num);
			}  break;
        
	    case 2:
			{ withdrawalamount(num1);

			}   break;
	   
		case 3:
			{  System.out.println(d.balance);

		    }    break;

			default:{
				System.out.println("Enter valid option");
			}
	   }

	         check=4;
		}else{
           
		   System.out.println(" Incorrect password");

		   check++;
		   System.out.println("Please reEnter the password ");

		 if (check>3);
		   System.out.println("account blocked");
        
		}

		}
	   public static void deposit(double num)
	    {
			Digital_banking d= new Digital_banking();
		   System.out.println("enter the deposit amount:");
		   Scanner sc=new Scanner(System.in);
		    double amount=sc.nextDouble();
		    d.balance=d.balance+amount;
		   System.out.println("deposit done");
	    }
       public static void withdrawalamount(double num1)
		{
		   Digital_banking d= new Digital_banking();
			System.out.println("enter the withdrawal amount:");
			Scanner sc=new Scanner(System.in);
			double amount=sc.nextDouble();
		    
		    d.balance=d.balance+amount;
			System.out.println("balance-withdrawal amount= new balance");
            System.out.println("new balance:");
		    			
	    }
   }
