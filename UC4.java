package TICTACTOE;

import java.util.Scanner;

public class UC4 {

	private static char  [][] gameboard;
	private static char  Player;
	
	
	public static void initializegameboard() {
		for (int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				gameboard[i][j]='-';
			}
		}
	}
	
	
	public static void choice() {
		Scanner s=new Scanner(System.in);
	     System.out.println(" Enter 1 to choose X\n Enter 2 to choose O");

		 int n=s.nextInt();
		     if( n==1)
		       System.out.println(" The Player choose X");
		     else
		       System.out.println(" The Player choose O");
		  }
	
	public static void printgameboard() {
		 System.out.print("--------------\n");
		
		  for (int i=0; i<3; i++) {
			System.out.print("|");
			for (int j=0; j<3; j++) {
				System.out.print(gameboard[i][j] + "|");
			}
			System.out.println();
			System.out.println("--------------");
		  }
	}
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		gameboard = new char[3][3];
		 initializegameboard ();
		 
	     System.out.println("Welcome to TicTacToe Game");
		 choice ();
		 printgameboard();
	     
		 System.out.println("Enter the position you want to fill:b/w (1-9)");
		 int position=s.nextInt();
		 
		 if((position > 0) && (position<=9))
          System.out.println(position);
          else
            System.out.println("Invalid Input!");
	
	}

	public static char getPlayer() {
		return Player;
	}

	public static void setPlayerMark(char player) {
		Player = player;
	}	 
	
	
}
