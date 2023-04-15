package program.basic;

public class Bank
{
	public static void main(String[] args) 
	{
		int result;
		Bank lav=new Bank();
	    lav.fillform( "anbu", 23, 26059999 );
	    Bank raghul=new Bank();
	    raghul.fillform("raghul",23,17012000,2000 );
	}

	private int fillform(String name, int age, int dob, int year)
	{
		name="raghul";
		age=23;
		dob=17012000;
		year=2000;
		System.out.println(name+dob);
		return dob;
	}

	private void fillform(String name,int age,int dob) 
	{
	name="lav";
	age=23;
	dob=26059999;
	System.out.println(name+dob);
	}

}
