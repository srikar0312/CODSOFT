/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.*;
public class RandNumb
{
	public static void main(String[] args) {
	    int max=100,min=1;
	    int ranNum=(int)Math.random()*(max-min+1)+min;
	    System.out.println("The generated number is "+ranNum);
	    Scanner s=new Scanner(System.in);
	    int score=100,NumberOfAttempts=10,count=0;
	    while(count<NumberOfAttempts)
	    {
	        System.out.print("Guess the number:");
	        int GuessNum=s.nextInt();
	        if(GuessNum==ranNum)
	        {
	            System.out.println("your guessed number is correct as randomly generated number");
	            System.out.println("your score is "+score);
	            break;
	        }
	        else{
	            System.out.println("your's guessed number is not correct and try again");
	        }
	        count++;
	        score-=10;
	    }
	}
}
