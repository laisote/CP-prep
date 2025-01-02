import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner scanner = new Scanner(System.in);
		
		//System.out.println("Number of test cases:");
		int testCases = scanner.nextInt();
		
		for(int i = 0; i < testCases; i++){
		    //System.out.println("Enter the first number:");
		    int firstNumber = scanner.nextInt();
		    
		    //System.out.println("Enter the second number:");
		    int secondNumber = scanner.nextInt();
		    
		    //System.out.println("Enter the third number:");
		    int thirdNumber = scanner.nextInt();
		    
		    greaterAverage(firstNumber, secondNumber, thirdNumber);
		}
		
		scanner.close();
	}
	
	public static void greaterAverage (int a, int b, int c){
	    float average = (a + b)/2.0f;
		if(average > c){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	}
}
