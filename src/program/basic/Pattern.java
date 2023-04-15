package program.basic;

public class Pattern {

	public static void main(String[] args) {
		int row;
		int col;
		
		for(row=3; row>=1; row--)
		{
			for(col=3; col>=row; col--)
			{
				System.out.print((row));	
			}
		System.out.println();	
		}

	}

}
