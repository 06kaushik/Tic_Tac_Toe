package TICTACTOE;

public class UC1 {
	
	public static void displayGrid(char[][] grid)
	{
		
		for (int i =0; i < 2; i++)
		{
			for (int j = 0; j <2; j++)
			{
				System.out.print(grid[i][j] + "|");
				}
			System.out.print(grid [i][2]);
			System.out.println();
			System.out.println("---------");
	}
		for (int j = 0; j <2; j++)
		{
			System.out.print(grid[2][j] + "|");
			}
		System.out.print(grid [2][2]);
		System.out.println();
	}


    public static void main(String[] args) {
    	
    	char[][] grid = new char [3][3];
    	
    	grid[0][0] = 'X';
    	grid[0][1] = '0';
    	grid[0][2] = 'X';
    	grid[1][0] = '0';
    	grid[1][1] = 'X';
    	grid[1][2] = '0';
    	grid[2][0] = 'X';
    	grid[2][1] = '0';
    	grid[2][2] = 'X';
    	 
    	displayGrid(grid);
    	
    	
    }
    	
    }



