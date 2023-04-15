package program.basic;

public class BankConst 
{
	
	public BankConst(int i, int j, String string)
	{
	 i=4000;
	 j=40;
	 string="ravi";
	 System.out.println("updated ravi detail");
	 System.out.println(string);
	}

	public BankConst(int i, String string) 
	{
	i=4000;
	string="raj";
	System.out.println("updated raj detail");
	System.out.println(string);
	}

	public static void main(String[] args) 
	{
		int i,j;
		String string;
		BankConst manager=new BankConst( 40000,"ravi");
	    BankConst clerk=new BankConst(4000,40,"raj");	
	    manager.applyloan();
	    
	}

	private void applyloan() 
	{
		System.out.println("qualified");
		
	}
}
