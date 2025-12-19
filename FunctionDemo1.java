n
import java.util.Scanner;
class FunctionDemo1{

	public static int addDemo(int x,int y){

		return  x+y;
	}

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two Number :");

		int a =sc.nextInt();
		int b =sc.nextInt();

		System.out.println("Addition = "+ addDemo(a,b));
	}
}