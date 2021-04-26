package TICTACTOE;

import java.util.Scanner;


public class UC2 {
	
	private static char  [][] gameboard;
	private static char  Player;
	
	
	public static void initializeBoard() {
		for (int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				gameboard[i][j]='-';
			}
		}
	}
	
	
	public static void choice() {
	     Scanner scanner=new Scanner(System.in);
	     System.out.println(" Enter A to choose X\n Enter B to choose O");

		 int n=scanner.nextInt();
		     if( n==1)
		       System.out.println(" The Player choose X");
		     else
		       System.out.println(" The Player choose O");
		  }
	
	public static void main(String[] args) {
	     gameboard = new char[3][3];
		 initializeBoard ();
		 
	     System.out.println("Welcome to TicTacToe Game");
		 choice ();
	}

	public static char getPlayerk() {
		return Player;
	}

	public static void setPlayer(char player) {
		Player = player;
	}
}

