

import java.util.Scanner;

public class Adventuregame
{
static Scanner s=new Scanner(System.in);
public static void main(String args[])
{
System.out.println("welcome to the text adventure game ! !");
System.out.println("1.Enter into the cave");
System.out.println("2.Quit the game");
int a=s.nextInt();
if(a==1)
{
  	System.out.println("\nSolve the puzzle to enter into cave ");
  	System.out.println("If A=2 ,B=4,C=6 ...... Z=?");
  	int b=s.nextInt();
  	if(b==52)
  	{
  		System.out.println("Score:10");
  		option1();
  	}
  	else
  	{
  		System.out.println("\nOops! You lost the game, score:0");
  	}
}
else if(a==2)
{
  System.out.println("\nYou Quit the game, Score:0");
}
else
{
	System.out.println("\nInvalid choice");
}
}
public static void option1() {
	System.out.println("\n1.Choose the Door1");
	System.out.println("2.Choose the Door2");
	System.out.println("3.Choose the Door3");
	int n=s.nextInt();
	if(n==1) {
		System.out.println("\nSolve the puzzle to open the Door1");
		System.out.println("What is the size of integer in Bytes");
		int ans=s.nextInt();
		if(ans==4) {
			System.out.println("\nScore:20");
			System.out.println("You entered into the Door1");
			System.out.println("You won the Sword");
			option3();
		}
		else
		{
			System.out.println("\nSorry You are unable to solve puzzle\n Score:10");
		}
	}
	else if(n==2) {
		System.out.println("\n Oops! You lost the sword");
		System.out.println("\nSolve the puzzle to open the Door2");
		System.out.println("What is the increment value of ++5");
		int ans1=s.nextInt();
		if(ans1==6) {
			System.out.println("\nScore:20");
			System.out.println("You entered into the Door2");
			option2();
		}
		else
		{
			System.out.println("\nSorry You are unable to solve puzzle\n Score:10");
		}
	}
	else if(n==3)
	{
		System.out.println("\n Oops! You are into fire and burned\n Sorry! You lost the game\n Score:0");
	}
	else {
		System.out.println("\nYou selected the wrong Door");
		System.out.println("You Quit the Game\n Your Score :10");
	}
}
public static void option2()
{
	System.out.println("1.Will you fight with monster");
	System.out.println("2.Continue Walking");
	int c=s.nextInt();
	if(c==2)
	{
		System.out.println("\nYou open the treasure and score:30");
		System.out.println("To open the treasure Solve the codesnippet and find the value of b");
		System.out.println("\n#include <stdio.h>");
		System.out.println("int main(){");
		System.out.println("int a=5,b");
		System.out.println("b= ++a + a++}");
		System.out.println("return 0");
		int y=s.nextInt();
		if(y==12)
		{
			System.out.println("\nYou won the treasure and score:50");
		}
		else
		{
			System.out.println("\nOops! you lost the treasure \n You dont have any sword to fight,score: 40");
		}
		
	}
	else if(c==1)
	{
		System.out.println("\nOops! You lost the battle with monster, Score:20");
	}
	else
	{
		System.out.println("Invalid");
	}

}
public static void option3()
{
	System.out.println("\n1.Will you fight with monster");
	System.out.println("2.Continue Walking");
	int c=s.nextInt();
	if(c==1)
	{
		System.out.println("\nHurray! You won the battle with monster and won the treasure,score :50");
		System.out.println("\nTo open the treasure solve the puzzle");
		System.out.println("If x=24÷[6×(2−1)] and y=12÷(4+2)×3  then x*y+x=?");
		int h=s.nextInt();
		if(h==28)
		{
			System.out.println("\nHurray! You won the game, Score:100");
		}
		else
		{
			System.out.println("\nOops!You are unable to solve puzzle and lost treasure, score:40");
		}
		
	}
	else if(c==2)
	{
		System.out.println("\nOops! You choosen wrong way and lost the game");
	}
	else
	{
		System.out.println("Invalid");
	}

}


}
