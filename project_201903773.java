package mypackage;						// Akshita Aggarwal 201903773
import java.util.*;						/*Importing the Scanner class*/

public class project_201903773 {

	
	public static Scanner scan = new Scanner(System.in);				// Creating scan object to access Scanner		
	public static float currentBalance;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to New Akshita Aggarwal Personal Bank");
		boolean flag = true;
		while(flag)
		{
			System.out.println("Please select an option to start transaction:");
			
			System.out.println("1) Open a Bank Account");
			System.out.println("2) Deposit into Personal Account");
			System.out.println("3) Withdraw from Personal Account");
			System.out.println("4) Exit");
			
			int choice = scan.nextInt();
			
			switch (choice) 
			{
				case 1:
					openAccount();
					break;
					
				case 2:
					depositIntoAccount();
					break;
					
				case 3:
					withdrawFromAccount();
					break;
										
				case 4:
					System.out.println("Now exiting");
					flag = false;
					break;
			
				default:
					System.out.println("Please choose option from 1 to 5");
					System.exit(0);
			}
		}
	}

	public static void openAccount()
	{
		String firstName, lastName, age;
		scan.nextLine();
		
		System.out.println("Enter First name");
		firstName = scan.nextLine();
		
		if (firstName.equals(""))
		{
			System.out.println("Data is required. Please enter a value.");
			System.exit(0);
		}
		
		System.out.println("Enter Last name");
		lastName = scan.nextLine();

		if (lastName.equals(""))
		{
			System.out.println("Data is required. Please enter a value.");
			System.exit(0);
		}

		System.out.println("Enter Age");
		age = scan.nextLine();
		
		if (age.equals(""))
		{
			System.out.println("Data is required. Please enter a value.");
			System.exit(0);
		}
		System.out.println("Congratulations! Your account has been created successfully");
	}
	
	public static void depositIntoAccount ()
	{
		System.out.println("Please enter the amount to be deposited into the account");
		float amount = scan.nextFloat();
		
		if(amount > 0)
		{
			currentBalance = amount;
			System.out.println("Deposit completed successfully.");
		}
		else
		{
			System.out.println("Invalid amount");
			System.exit(0);
		}
	}
	
	public static void withdrawFromAccount ()
	{
		System.out.println("Please enter the amount to be withdrawn from the account");
		float amount = scan.nextFloat();
		
		if(amount > 0)
		{
			while(amount > currentBalance)
			{
				System.out.println("Insufficient fund. Please enter a smaller amount");
				amount = scan.nextFloat();
			}
			
			currentBalance -= amount;
			System.out.println("Withdawal completed. Your remaining balance is: $" + currentBalance);
		}
		else
		{
			System.out.println("Invalid amount");
			System.exit(0);
		}
	}
	
}
