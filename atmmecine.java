package basicprogram;

import java.util.Scanner;

public class atmmecine {

static void alertmessage(int machinebalance)
{
	int alertlimit=5000;	
		if(machinebalance<=alertlimit)
		{
			System.err.println("!!!!reful the atm machine!!!!");
//			throw new ArithmeticException(machinebalance);
		}
}
	
	
static boolean machincebalance(int withdraw)
{
	int machinebalance=10000;
	System.out.println("====machine to bank message====");
	if(withdraw<=machinebalance)
	{	
		if(withdraw<=10000)
		{
			machinebalance+=-withdraw;
//			System.out.println("machince balance"+machincebalance);
			alertmessage(machinebalance);
			return true;
		}	
		else
		{
			System.out.println("----!!!high amount try again within 10000!!!----");
		}
	}
	else	
		System.out.println("Not enough money in machine");
		return false;		
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int balance=30000;
		int userpin=5656;
		int withdraw,deposit;
		int n;
		System.out.println("...Enter the pin...");
		int pin=scan.nextInt();
		int temp=0;
		int newpin;
		int accountlimit=20000;
		if(pin==userpin)
		{	
		while(true)
		{
			System.out.println(" ");
			System.out.println("choose 1 for withdraw");
			System.out.println("choose 2 for deposit");
			System.out.println("choose 3 for balance check");
			System.out.println("choose 4 for change the pin ");
			System.out.println("choose 5 for quick withdraw");
			System.out.println("enter your choose:");
			System.out.println(" ");
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the money to withdrawn");
				withdraw=scan.nextInt();
					if(machincebalance(withdraw)==true)
					{
						if(withdraw<=balance)
						{
							balance+=-withdraw;
							System.out.println("");
							System.err.println("====customer detial===");
							System.out.println(" ");
							System.out.println("Please collect your cash");
							System.out.println(" ");
							System.out.println("Remaining balance"+ balance);
							
						}
						else	
						{
							System.out.println(" ");
							System.out.println("Low balance!!!");
						
						}
					}	
			break;
			case 2:
				System.out.println("Enter the cash to be deposit ");
				deposit=scan.nextInt();
				System.out.println(" ");
				System.out.println("Conform 0");
				System.out.println(" ");
				System.out.println("Not conform 1");
				n=scan.nextInt();
				if(n==0)
				{
					balance+=+deposit;
					System.out.println("Your amount is successfully deposited. ");
					System.out.println(" ");
				}
				if(n==1)
				{
					System.out.println("Collect your cash");
					System.out.println(" ");
				}
			break;
			case 3:
				System.out.println("The balance amount: "+balance);
				System.out.println(" ");
			break;	
			case 4:
				System.out.println("Set the new pin ");
				n=temp;
				System.out.println("Enter the new pin");
				newpin=scan.nextInt();
				newpin=n;
				System.out.println("pin has been updated.");
				System.out.println(" ");
			break;
			case 5:
				System.out.println("quick withdraw");
				int m=1;
				while(m==1)
				{
					System.out.println("choose 1 for 500");
					System.out.println("choose 2 for 1000");
					System.out.println("choose 3 for 2000  ");
					System.out.println("choose 4 for 5000  ");
					System.out.println("choose 5 for 10000 ");
					System.out.println("");
				    int choice2=scan.nextInt();
				    switch(choice2)
				    {
				    case 1:
				    System.out.println("please wait your transion is processing...");
				    if(machincebalance(500))
				    {
				    	if(balance>=500)
				    	{
				    		balance+=-500;
				    		System.out.println("");
							System.err.println("====customer detial===");
							System.out.println(" ");
							System.out.println("Please collect your cash");
							System.out.println(" ");
							System.out.println("Remaining balance"+ balance);
				    	}
				    	else
				    	{
				    		System.out.println("No enough amount in your's accout!!!");
				    	} 
				    }	
				    m=0;
				    break;
				    case 2:
				    if(machincebalance(1000))
				    {
				    	if(balance>=1000)
						{
							balance+=-1000;
							System.out.println("");
//							System.err.println("====customer detial===");
							System.out.println(" ");
							System.out.println("Please collect your cash");
							System.out.println(" ");
							System.out.println("Remaining balance"+ balance);
						}
						else
						{
							System.out.println("No enough amount in your's accout!!!");
						}
				    }
				    m=0;
				    break;
				    case 3:
				    if(machincebalance(2000))
				    {	
				    	if(balance>=2000)
							{
								balance+=-2000;
								System.out.println("");
//								System.err.println("====customer detial===");
								System.out.println(" ");
								System.out.println("Please collect your cash");
								System.out.println(" ");
								System.out.println("Remaining balance"+ balance);
							}
							else
							{
								System.out.println("No enough amount in your's accout!!!");
							}
				    }
				    m=0;
				    break;
				    case 4:
				    if(machincebalance(5000))
				    {	
					    if(balance>=5000)
					    {
							balance+=-5000;
							System.out.println("");
//							System.err.println("====customer detial===");
							System.out.println(" ");
							System.out.println("Please collect your cash");
							System.out.println(" ");
							System.out.println("Remaining balance"+ balance);
					    }
					    else
					    {
					    	System.out.println("No enough amount in your's accout!!!");
					    }
				    } 
				    m=0;
					break;
				    case 5:
				    if(machincebalance(10000))
				    {
					   if(balance>=10000)
					   {
						   balance+=-10000;
							System.out.println("");
//							System.err.println("====customer detial===");
							System.out.println(" ");
							System.out.println("Please collect your cash");
							System.out.println(" ");
							System.out.println("Remaining balance"+ balance);
					   }
					   else
					   {
					    	System.out.println("No enough amount in accout!!!");
					    }
				    } 
				    m=0;
					 break;
				  
				    }
				}
			}
		}
		}
		else
		{
			System.out.println("Enter the valid pin");
		}
	}

}
