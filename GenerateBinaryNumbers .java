import java.util.LinkedList;  
import java.util.Queue;
import java.util.Scanner;  
class GenerateBinaryNumbers   
	{  
		private static void generateBinaryNumbers(int n)   
			{  
				if (n == 0)
				{  
					//returns 0 if n=0      
					return;  
				} 
 
				//creating a Queue of type String  
				Queue<String> que = new LinkedList<>(); 
	 
				//adding the root element to the queue which is the first binary number  
		
				que.add("1");  
				//initialize total as 0  
				int total = 0;  
				//check if the total is less than n  

			while (total < n)   
			{  
				//remove an element from the Queue and print it  

				String curr = que.poll();  
				System.out.print(curr + " ");  

				//appending 0 and 1 in the left and right child respectively 
  
				que.add(curr + "0");  
				que.add(curr + "1");  

				//increment the variable total by 1  

				total++;  
			} 
 
			System.out.println();  

		}  
	//main method  

	public static void main(String args[])   
	{  
		
		Scanner sc = new Scanner(System.in); 

		System.out.println("Enter the no to Print binary no1:");
		int n1 = sc.nextInt();
		generateBinaryNumbers(n1);
		System.out.println("Enter the no to Print binary no2:");  
		int n2 = sc.nextInt();  
		generateBinaryNumbers(n2);  
	}  
}   
