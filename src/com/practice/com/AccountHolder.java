package com.practice.com;

public class AccountHolder {

	public static void main(String[] args) 
	{
	BankBalance bb=new BankBalance();
	
	int minimumBalance = bb.getMinimumBalance();
	System.out.println("Minimum Balance  "+minimumBalance);
	bb.setMinimumBalance(3000);
    minimumBalance = bb.getMinimumBalance();
	System.out.println("Minimum Balance  "+minimumBalance);
	
	}
}
class BankBalance
{
	private int minimumBalance =30000;
	
	public int getMinimumBalance()
	{
		return this.minimumBalance;	
	}
	public void setMinimumBalance(int values)
	{
		if(values>2500)
			this.minimumBalance=values;
	}
	
}
