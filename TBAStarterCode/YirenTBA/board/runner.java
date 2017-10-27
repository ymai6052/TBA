package board;

public class runner {
	public static void main(String[]args)
	{
		String[][] nums= new String[5][5];
		DungBoard board=new DungBoard(nums);
		printing(nums);
	}
	//prints out the 2d string array that is passed in
	public static void printing(String[][] passIn)
	{
			for (int i = 0; i < passIn.length; i++)
			{
			    for (int j = 0; 
			    	j < passIn[i].length; j++) 
			    {
			        System.out.print(passIn[i][j] + " ");
			    }
			    System.out.println();
			}
	}
	
	
}
