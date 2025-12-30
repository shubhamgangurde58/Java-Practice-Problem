
import java.util.Scanner;
class NestedConditions{
	
	public	static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter MI No:");
		int mi = scanner.nextInt();
		System.out.println("Enter RCB No:");
		int rcb = scanner.nextInt();
		System.out.println("Enter CSK No:");
		int csk = scanner.nextInt();

		if(mi > rcb )
		{
			if(mi > csk){

				System.out.println("MI is Win");
			}else{
	
				System.out.println("CSK is Win");
			}
			
		}else{
			if(rcb > csk){

				System.out.println("RCB is win");
			}else{

				System.out.println("CSK is win");
			}
		}
	}
	
}