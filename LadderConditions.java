
import java.util.Scanner;
class LadderConditions{
	
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Marks:");
		int marks = scanner.nextInt();
		
		if(marks >= 80)
		{
			System.out.println("A Grade");

		}else if(marks >= 60){
			
			System.out.println("B Grade");

		}else if(marks >= 40){

			System.out.println("C Grade");

		}else {

			System.out.println("Sorry you Fail");
		}
	}
}