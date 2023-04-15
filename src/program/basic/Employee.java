package program.basic;

class Employee implements EmployeeRules 
{
	public void relocate()
	{
	System.out.println("other");	
	}
	public void dresscode()
	{
	System.out.println();	
	}
	public void hours()
	{
		
	}
  public static void main(String[] args) 
	{
  Employee obj=new Employee();
  obj.dresscode();
  obj.relocate();
  obj.hours();
  System.out.println(obj .SALARY);
  System.out.println(obj.LEAVES);
	}

}
