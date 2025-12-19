
import java.util.Scanner;
class FactorialDemo1{

	public static void printFactorial(int n){

		int fact = 1;

		if(n<0){

			System.out.println("Invalid Number:");
			return;
		}

		for(int i=n;i>=1;i--)
		{
	
			fact = fact * i;

		}
	
		System.out.println("Factorial of Given No = "+ fact);
		return ;
	}

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");

		int n =sc.nextInt();
		
		printFactorial(n);
	}
}