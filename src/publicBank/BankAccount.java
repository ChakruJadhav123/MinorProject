package publicBank;

import java.util.Scanner;
class BankAccount {
	static String bankName="Bank of Maharastra";
	private long accountNumber;
	private String accountHolderName;
	private double balance;

	BankAccount(long accountNumber,String accountHolderName){
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
	}

    BankAccount(long accountNumber,String accountHolderName,double balance) {
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}
	public void deposit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount To be Deposited : ");
		int amt=sc.nextInt();
		if(amt>0)
		{
			balance=balance+amt;
			System.out.println(amt+" RS deposited successfully");
		}
		else {
			System.out.println("Deposite amount should be more than 500.");
		}
	}
	public void last10Transaction()
	{
		int a=2377,amt=2000;
		for(int i=26;i>=8;i-=2)
		{
			System.out.println(i+" FEB 2024");
			System.out.println("TRANSFERED TO XXXXXX"+a);
			System.out.println("DEBITED FROM BANK OF MAHARASTRA.");
			System.out.println("RS "+amt);
			amt+=1732;
			a+=232;
			if(amt>2800)amt-=2330;
			System.out.println();
		}
	}
	public void withdraw() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount To be Withdraw : ");
        int amt=sc.nextInt();
		if(amt==0)
		{
			System.out.println("Withdrawel amount should be more than 500.");
		}
		else if(amt<balance) {
			balance = balance - amt;
			System.out.println(amt+" Rs withdrawn successfully");
		}
		else {
			System.out.println("insufficient balance.");
		}
	}
	public void balanceInquiry()
	{
		System.out.println("BALANCE IN YOUR ACCOUNT : "+balance);
	}
	public void displayAccountDetails() {
		System.out.println("Name of customer: "+accountHolderName);
		System.out.println("Account number: "+accountNumber);
		System.out.println("Avaialable balance:  "+balance);
	}
	public void service()
		{
			Scanner sc=new Scanner(System.in);
	        System.out.println("-------------------------------------------------------");
	        System.out.println("Enter your Choice :");
            System.out.println("Enter 1 : For Diposit Amount.");
	       System.out.println("Enter 2 : For Withdraw Amount.");
	       System.out.println("Enter 3 : For Mini Statement.");
           System.out.println("Enter 4 : For Balance Enquiry.");
	       System.out.println("Enter 5 : For Show Account Details.");
	       System.out.println("_");
           int ch=sc.nextInt();
	switch(ch)
		{
		case 1:deposit();
		break;
		case 2:withdraw();
		break;
		case 3:System.out.println("LAST 10 TRANSACTIONS ARE :");
		last10Transaction();
		break;
		case 4:balanceInquiry();
		break;
		case 5:displayAccountDetails();break;
		default:System.out.println("Invalid Input!.");
		
	}
    	System.out.println();
	System.out.println("Do You Want To Continue With this Account : " );
	System.out.println("Enter 1: For Other Services :");
	System.out.println("Enter 2: For another Acoount :");
	System.out.println("Enter 3 for exit : ");
	int c=sc.nextInt();
	if(c==1)
	{
		service();
	}else if(c==2||c==3)return;
	else System.out.println("Invalid input");
		}
	public static void main(String[] args) {
	BankAccount account1 = new BankAccount(123456789L, "Rajendra");
	BankAccount account2 = new BankAccount(98765432L, "Akshat",50000);
    System.out.println();
	System.out.println("\t*Welcome to Bank of Maharastra*");
	System.out.println("\t-----------------------------------------------");
	account1.service();
	account2.service();
	
}
}